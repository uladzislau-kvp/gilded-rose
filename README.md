# Gilded Rose for Accenture

### Run Application

For e.g. 10 days:

```
./gradlew run --args 10
```

You should make sure the gradle commands shown above work when you execute them in a terminal.

### Branches
There is three branches in the project:
* main - actual main working branch
* refactor - commits related to refactor
* feature - commits related to new feature (handling new item type)

Branches 'refactor' and 'feature' were already merged into 'main' branch, but still presented
for history purposes.

### Changes
You can find all commits with detailed descriptions here: https://github.com/uladzislau-kvp/gilded-rose/commits/main.</br>
By these commits you can see all the refactoring steps. 

### More changes
Basically I did major changes for GildedRose class and minor for others, because instructions were:
"Feel free to make any changes to the UpdateQuality" and "do not alter the Item class or Items property".

But in my opinion there are still several possible modifications, for example:
* create packages for classes
* give proper names for classes
* add some javadocs for public methods
* add more tests
* add 'type' field to Item class
* etc.