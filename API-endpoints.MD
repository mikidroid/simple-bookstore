# Rest Endpoints for this backend

##  Book Model 

**POST** /api/book/add
> Adds new book
- Form must be in Application/Json 
- Fields to add includes;
1. name
2. author
3. releaseYear
4. description

**GET** /api/book
> Fetches all books

**PUT** /api/book/update/{id}
> Updates book

**DELETE** /api/book/delete/{id}
> Deletes book

##  Comment Model 

**POST** /api/comment/add
> Adds new book comment
- Form must be in Application/Json 
- Fields to add includes;
1. name
2. body
3. createdAt

**GET** /api/comment/{bookId}
> Fetches comments for a book

**PUT** /api/comment/update/{id}
> Updates comment

**DELETE** /api/comment/delete/{id}
> Deletes comment

