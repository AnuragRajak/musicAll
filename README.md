# MusicAll
A Spring Boot & Postgres Spotify Clone

## MusicAll Colleagues 
- Benjamin Kats (@<a href = "https://github.com/BenKats">BenKats</a>)
- Judy Truong (@<a href="https://https://github.com/judycodes">JudyCodes</a>)

## Technologies
- Spring Boot
- Postgres
  
## Application Approach

_Day 1_ | _Day 2_ | _Day 3_ | _Day 4_ | _Day 5_ | _Day 6_ |
--- | --- | --- | --- | --- | --- |
Spring Boot Setup | ERD Brainstorm & Designed | Create Role Endpoint | Playlist, Artist & Song - Model, Repository | JWT Functional - Signup & Login | Signup & Login Testing Started
Profile Configuration | Git Workflow Implementation | User, Signup, & Login Endpoints | Spring Security & JWT Started | Relational Mapping | listAllSongs & addSong Endpoint
    |     | User & Role - Model, Repository, Controller, & Service | | | Delete User Functionality | Default UserRole For signup
    |     
    |     |     |     |  | ERD Design Update |     
        
### MusicAll Entity Relationship Diagram
<img alt = "MusicAll ERD" src="imgs/MusicAll_ERD_final.png"/><br/>

### Models Information
- musicAll has four data models: `User`,`Role`, `Song`, `Artist`, & `Playlist`.
- `User` Model has the fields: id, username, password, playlistId, & roleId.
- `Role` Model has the fields: roleId & roleType.
- `Playlist` Model has the fields: playlistId, name, songId, & userId. 
- `Song` Model has the fields: songId, title, genre, length & artistId.
- `Artist` Model has the fields: artistId & name.

- Users MUST have at least one playlist and should have the default role of 'user'. This is to encourage users to fulfill the purpose of the application, which is to gather songs into a playlist. The default role of 'user' for accounts created is to specify and limit the privileges of users. 
- Each playlist MUST contain at least one song, which is to further encourage users to build their playlist of songs. 
- Each song has an artist & an artist can have one or many songs.   
 
## Completions

## Challenges
- Understanding the idiosyncrasies of Spring Boot with Postgres Integration

## Reflection 
### Which part you enjoyed working on the most?
- **Judy:** Pair programming and collaboratively brainstorming was educational and energizing, particularly when overcoming challenges, researching concepts, and resolving bugs. 

- **Benjamin:**

