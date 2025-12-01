# 📘 Bookmark Manager API

Bookmark Manager API adalah aplikasi backend sederhana berbasis **Spring Boot 3**, menggunakan **Java 21** serta **MySQL** sebagai database.  
Aplikasi ini menyediakan fitur CRUD untuk menyimpan, menampilkan, memperbarui, dan menghapus bookmark dengan struktur response yang konsisten.

proyek ini menggunakan:

✅ Pola Layered Architecture. ✅ DTO untuk memisahkan domain dan response. ✅ Response API konsisten melalui wrapper class.

---

## 🚀 **Teknologi yang Digunakan**

-   **Java 21**
-   **Spring Boot 3.4.12**
-   **Spring Web**
-   **Spring Data JPA**
-   **Jakarta Validation**
-   **MySQL**
-   **Lombok**

---

## 🧩 **Fitur Utama**

-   Menambahkan bookmark
-   Melihat semua bookmark
-   Melihat detail bookmark berdasarkan ID
-   Mengubah bookmark
-   Menghapus bookmark
-   Response API menggunakan format wrapper (status, message, data)
-   Global Exception Handling

---

## 📁 **Struktur Proyek**

```bash
src/main/java/com/example/bookmarkmanager
│
├── controller
│ └── BookmarkController.java
│
├── dto
│ ├── BookmarkRequest.java
│ ├── BookmarkResponse.java
│ └── ApiResponse.java
│
├── entity
│ └── Bookmark.java
│
├── repository
│ └── BookmarkRepository.java
│
├── service
│ └── BookmarkService.java
│
└── exception
├── GlobalExceptionHandler.java
└── NotFoundException.java
```

---

## ⚙️ **Cara Menjalankan Proyek**

### 1. **Clone repository**

```bash
git clone https://github.com/yourname/bookmark-manager.git
cd bookmark-manager
```

### 2. **Buat database MySQL**

```bash
CREATE DATABASE bookmark_db;
```

### 3. **Konfigurasi application.properties**

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/bookmark_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 📝 **Endpoint Dokumentasi**

1. Create Bookmark POST /api/bookmarks

```bash
Request:
{
  "title": "Spring Boot Docs",
  "url": "https://spring.io/projects/spring-boot",
  "description": "Official documentation"
}

Response:
{
  "status": "success",
  "message": "Bookmark created",
  "data": {
    "id": 1,
    "title": "Spring Boot Docs",
    "url": "https://spring.io/projects/spring-boot",
    "description": "Official documentation"
  }
}
```

2. Get All Bookmarks GET /api/bookmarks

```bash
Response:
{
  "status": "success",
  "message": "Bookmarks retrieved",
  "data": [
    {
      "id": 1,
      "title": "Spring Boot Docs",
      "url": "https://spring.io/projects/spring-boot",
      "description": "Official documentation"
    }
  ]
}
```

3. Get Bookmark by ID GET /api/bookmarks/{id}

```bash
Response:
{
  "status": "success",
  "message": "Bookmark retrieved",
  "data": {
    "id": 1,
    "title": "Spring Boot Docs",
    "url": "https://spring.io/projects/spring-boot",
    "description": "Official documentation"
  }
}
```

4. Update Bookmark PUT /api/bookmarks/{id} Request sama seperti create.

```bash
Response:
{
  "status": "success",
  "message": "Bookmark updated",
  "data": {
    "id": 1,
    "title": "Updated Title",
    "url": "https://updated-url.com",
    "description": "New description"
  }
}
```

5. Delete Bookmark DELETE /api/bookmarks/{id}

```
Response:
{
  "status": "success",
  "message": "Bookmark deleted",
  "data": null
}
```

## ❗ **Error Handling**

Semua error di-handle melalui GlobalExceptionHandler. Contoh error response:

```bash
{
  "status": "error",
  "message": "Bookmark not found",
  "data": null
}
```

## 📌 **Tujuan Proyek**

-   Belajar dasar pembuatan REST API menggunakan Spring Boot.
-   Memahami Layered Architecture (Controller → Service → Repository).
-   Melatih penggunaan DTO, Entity, dan Exception Handling.
-   Menyiapkan pola standar response API yang rapi dan konsisten.
-   Menjadi fondasi untuk proyek Spring Boot tingkat lanjut.
-   Menambah koleksi portofolio backend berbasis Java/Spring.
