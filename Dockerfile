# Java 17 の実行環境
FROM eclipse-temurin:17

# アプリを配置する作業ディレクトリ
WORKDIR /app

# ビルド済みの JAR をコピー
COPY target/app.jar app.jar

# Spring Boot のデフォルトポート
EXPOSE 8080

# アプリ起動コマンド
CMD ["java", "-jar", "app.jar"]
