package com.example.memo_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.memo_app.entity.Memo;
import com.example.memo_app.repository.MemoRepository;

@Controller
public class MemoPageController {

    private final MemoRepository repo;

    public MemoPageController(MemoRepository repo) {
        this.repo = repo;
    }

    // 一覧 + 入力フォーム
    @GetMapping("/")
    public String index(@RequestParam(value = "editId", required = false) Long editId,
                        Model model) {

        model.addAttribute("memos", repo.findAll());

        if (editId != null) {
            Memo memo = repo.findById(editId).orElse(null);
            model.addAttribute("editMemo", memo); // 編集モード用
        } else {
            model.addAttribute("editMemo", null); // 追加モード
        }

        return "index"; // templates/index.html
    }

    @PostMapping("/memo")
    public String create(@RequestParam String text) {
        Memo memo = new Memo();
        memo.setText(text);
        repo.save(memo);
        return "redirect:/";
    }

    @PostMapping("/memo/update")
    public String update(@RequestParam Long id, @RequestParam String text) {
        Memo memo = repo.findById(id).orElse(null);
        if (memo != null) {
            memo.setText(text);
            repo.save(memo);
        }
        return "redirect:/";
    }

    @GetMapping("/memo/delete/{id}")
    public String delete(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}
