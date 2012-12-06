# Play 2.1 RC Sub Project with Routes Example

In this very simple sample we have a sub project in Play with both shared routes and objects.


## Notes

Play sub projects seem to require that we have the *submodule* directory be contained within the *core* directory; 
I don't like this cause I want to share a single code base with many projects!

To make this work with the its own directory I used a Softlink b/w the core and submodule directory.


## Project Layout

The sample assumes we have a submodule that will be shared with other projects and a core project that will use it

    shared_project 
    └ app
    └ conf
    └ public
    core
    └ app
    └ conf
    └ public


Using the new Play 2.1 feature, we will also make sure to include the routes from the *shared_project*.



## Usage


After doing a git clone, simply run *play* inside of the _core_ directory
         
         cd core
         play run


### TBD

- clean up README
- explain structure and views completely
- fix all tests
