# Комментарий к задаче №1 - "Vk"

При проектировании классов для хранения данных о посте было очевидно использование таких классов как:
 * Post.java
 * CommentsInfo.java
 * ViewsInfo.java
 * LikesInfo.java
 * RepostInfo.java 

В данных классах неочевидно использование таких полей :
 * reply_owner_id
 * reply_post_id
 * friends_only
 * postponed_id
 * signer_id 

Так же при анализе документации Vk неочевидными явилось создание классов таких как:
 * Geo.java
 * PostSource.java
 * Place.java
