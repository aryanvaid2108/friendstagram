# friendstagram

The aim of this project was to create a simple social media network using a graph structure, with an adjacency list in particular. Each person in the network should at least have a profile that contains the person’s name, optional image, current status, and a list of friends. Your application should allow a user to join the network, leave the network, create a profile, modify the profile, search for other profiles, and add friends. Users should also be able to track their friend’s relationships among members of the network. 

Keeping these minimum requirements in mind, my project allows a user to sign up with an email address, username and a password.  My application, called Friendstagram, has strict client-side username, email and password verification methods, which check for a particular format requirement. Once a user has successfully signed up, they can log in with their username and password. When the user logs in for the first time, they are directed to a page which requires them to set their information. They must set their first and last name, date of birth, gender, phone number, status and profile picture. They can visit this page in the future as well, to update any of this information. The users then have option to either visit their friend list page or the discover page where they can search for users in the network by their username. They can visit the search users’ profile and add them as a friend. 

The entire social media network in managed on an unweighted, undirected graph structure, which works with adjacency lists. New users are added as a vertex to the graph. A connection, i.e. a friendship between existing users is created by adding an edge to the graph between the two users. A list of vertices is also maintained both, in the user object and the graph object, which is done for efficiency of searching. 

The application has a clean, elegant UI which makes it easy, but interesting to use. The database of the application is implemented using File IO. All the user information is sorted in a file called database.txt and is loaded into the application as soon as it is launched.


Screenshots of the working application:

1>	User Sign Up page - 




![](Picture1.png)











2>	User Sign In page 
