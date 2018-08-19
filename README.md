<h2> Food Ordering System: </h2>

This is a Desktop based application mainly used for ordering food.
Features: 
* User can register, view menu, order food from anywhere, manage their profile.
* Anyone can order food, but registered users get discount/promotion.
* Admin can place food order inside food shop, modify his profile info.
* Users can also leave their valuable feedback through a comment section.

<h4> Language used              : Java </h4>

<h4> Database                        : MySQL </h4>

<h2> How to run the project : </h2>

1. Import database (food_shop.sql) file to MySql server.

2. It'll probably give an error, because this database file size exceeded deafult MySql database importing filesize.

    Go to <b> php.ini </b> file and find these two things below : 

     <b>//upload_max_filesize<br/>
     //post_max_size</b>

    And change their value like these :

    <b>upload_max_filesize = 10M<br/>
    post_max_size = 10M</b>

    Check this link, it'll help : https://stackoverflow.com/questions/3958615/import-file-size-limit-in-phpmyadmin

    Database -> Done.

3. Now, on your <b>command prompt window</b>, run the <b>Non-Packaged Version</b> with command : java Main

4. Run the <b>Packaged Version</b> with : java home.Main
5. <b>This is very basic java project. My intention to upload this so that java beginners can learn from it, get some idea for their project.</b>
6. Enjoy !!
