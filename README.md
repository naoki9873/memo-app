# 📘 Spring Boot メモアプリ（学習用）

Spring Boot（MVC）・Thymeleaf・MySQL・Docker Compose を学習するために作成したメモアプリです。  
1画面で「追加・編集・削除」ができる、シンプルな CRUD アプリケーションです。

---

## 📌 機能一覧

- メモの追加  
- メモの編集（同一画面で切り替え）  
- メモの削除  
- ダークモード UI（CSS 分離）  
- Thymeleaf を使用したテンプレートレンダリング  
- Docker Compose による MySQL + アプリ構成  

---

## 🛠 使用技術

### Backend
- Java 17  
- Spring Boot (Spring Web / Spring Data JPA / Thymeleaf)

### Frontend
- HTML + Thymeleaf  
- CSS（外部ファイル化）

### Database
- MySQL 8.0（Docker）

### DevOps / Others
- Docker / Docker Compose  
- Maven  

---

## 📂 フォルダ構成

memo-app/
├─ src/
│ ├─ main/
│ │ ├─ java/com/example/memoapp/
│ │ │ ├─ controller/ MemoPageController.java
│ │ │ ├─ entity/ Memo.java
│ │ │ └─ repository/ MemoRepository.java
│ │ ├─ resources/
│ │ │ ├─ templates/index.html
│ │ │ └─ static/css/style.css
├─ Dockerfile
├─ docker-compose.yml
└─ pom.xml



---

## ▶️ 起動方法（Docker Compose）

### 1. Jar をビルド

./mvnw clean package -DskipTests

shell
コードをコピーする

### 2. Docker Compose で起動

docker compose up -d --build

shell
コードをコピーする

### 3. ブラウザでアクセス

http://localhost:8080/


---

## 💡 画面イメージ（任意）

※ スクショを貼ると GitHub の見映えがさらに良くなる！


yaml
コードをコピーする

---

## 🎯 学習ポイント

- Spring Boot MVC の基本理解  
- Thymeleaf によるテンプレート表示  
- CRUD 実装フロー（Controller → Repository → DB）  
- Docker Compose を使った DB + アプリ構築  
- 外部 CSS を読み込んだ画面デザインの実装  

---

## 🚀 今後の拡張案

- タグ機能 / カテゴリ機能  
- 検索バー追加  
- バリデーション（空文字禁止など）  
- REST API バージョンの別実装  
- フロントを React に置き換える  
- ダーク・ライト切り替え  

---

## 🧑‍💻 作者

Naoki  
（学習記録用 / 個人開発用）

---
