# Sake - high alcohol programming language

### (used in TeamCity learning x6)

### changed in master

### This is my procedure programming language, that also can manipulate robots.

### It was created for educational purposes

### Tools: Java, ANTLRv4 

### Example of programs
#### Bubble sort:
```
seisu kansu swap(hairetsu A, seisu i, seisu j) kido
    seisu c = A[i];
    A[i] = A[j];
    A[j] = c;
    modoru 0; #return
shushi;

seisu kansu bubble(hairetsu A) kido
    seisu N = nagasa A;
    shuki j = 0 : N-1 kido
        ronri F = osu;
        shuki i = 0 : N-j-1 kido
            sorenara A[i] > A[i+1] kido
                swap(A, i, i+1);
                F = shinri;
            shushi;
        shushi;

        sorenara ~F kido
            j = N - 2;
        shushi;
    shushi;

    modoru 0;
shushi;

seisu N = 10;
hairetsu A = {N};
A[0] = 21;
A[1] = -21;
A[2] = 33213;
A[3] = 321;
A[4] = -321;
A[5] = 5+5;
A[6] = 5+2+10<15-(1+2);
A[7] = 0;
A[8] = -1;
A[9] = -11;

senden A;

bubble(A);

senden A;
```

#### Looking for an exit from the maze
```
hairetsu exits = {1};
exits[0] = [2, 11, 4, osu];

hairetsu myState = {1};
myState[0] = [3, 2, 4, 0];

seisu kansu printMaze(hairetsu mazeMatrix) kido
    shuki x = 0 : 30 kido
        shuki y = 0 : 30 kido
            shuki z = 0 : 30 kido
                sorenara ~(ruikei <mazeMatrix[x, y, z, 0], undefined>) kido
                    #senden 11111111;
                    senden [x, y, z, mazeMatrix[x, y, z, 1]];
                    senden mazeMatrix[x, y, z, 0];
                    senden mazeMatrix[x, y, z, 1];
                    senden mazeMatrix[x, y, z, 2];
                    senden mazeMatrix[x, y, z, 3];
                    #senden 22222222;
                shushi;
            shushi;
        shushi;
    shushi;
    modoru 0;
shushi;

seisu kansu replenish(hairetsu mazeMatrix, hairetsu add) kido
    shuki i = 0 : nagasa add kido
        mazeMatrix[add[i] => X, add[i] => Y, add[i] => Z, 0] = 1; #gray
        mazeMatrix[add[i] => X, add[i] => Y, add[i] => Z, 1] = add[i] => kabe;
        ronri isExit = osu;
        shuki e = 0 : nagasa exits kido
            sorenara eqCube(exits[e], add[i]) kido
                isExit = shinri;
            shushi;
        shushi;
        mazeMatrix[add[i] => X, add[i] => Y, add[i] => Z, 2] = isExit;
        mazeMatrix[add[i] => X, add[i] => Y, add[i] => Z, 3] = -1;
    shushi;

    modoru 0;
shushi;

ronri kansu eqCube(rippotai c1, rippotai c2) kido
    modoru ~(c1=>X > c2=>X v c1=>X < c2=>X) ^ ~(c1=>Y > c2=>Y v c1=>Y < c2=>Y) ^ ~(c1=>Z > c2=>Z v c1=>Z < c2=>Z) ^ (c1=>kabe ^ c2=>kabe v ~c1=>kabe ^ ~c2=>kabe);
shushi;

seisu kansu findWay(hairetsu mazeMatrix, hairetsu exits) kido
    hairetsu target = {1};

    shuki t = 0 : 1 kido
        lookAround(mazeMatrix);
        wave(mazeMatrix, myState[0] => X, myState[0] => Y, myState[0] => Z, 0);
        #printMaze(mazeMatrix);
        target[0] = [0, 0, 0, 0];

        seisu findStatus = findGray(mazeMatrix, target);

        sorenara findStatus < 1 kido
            senden -2;
            modoru -2; #no way out
        shushi;

        #senden target[0];

        hairetsu way = restoreWay(mazeMatrix, target[0]);
        clearWay(mazeMatrix);

        #senden way;

        travel(mazeMatrix, way);

        t = t - 1;

        sorenara inFinal() kido
            senden 0;
            modoru 0;
        shushi;

    shushi;
    modoru 0;
shushi;

seisu kansu lookAround(hairetsu mazeMatrix) kido
    replenish(mazeMatrix, {^-0; v-0; <-0; >-0; o-0; ~-0});
    coloring(mazeMatrix);
    modoru 0;
shushi;

seisu kansu coloring(hairetsu mazeMatrix) kido
    shuki x = 0 : 30 kido
            shuki y = 0 : 30 kido
                shuki z = 0 : 30 kido
                    sorenara ~(ruikei <mazeMatrix[x, y, z, 0], undefined>) kido
                        ronri top = osu;
                        ronri bottom = osu;
                        ronri left = osu;
                        ronri right = osu;
                        ronri fw = osu;
                        ronri back = osu;

                        sorenara z > 28 v z < 29 ^ ~(ruikei <mazeMatrix[x, y, z+1, 0], undefined>) kido
                            top = shinri;
                        shushi;

                        sorenara z < 1 v z > 0 ^ ~(ruikei <mazeMatrix[x, y, z-1, 0], undefined>) kido
                            bottom = shinri;
                        shushi;

                        sorenara x > 28 v x < 29 ^ ~(ruikei <mazeMatrix[x+1, y, z, 0], undefined>) kido
                            right = shinri;
                        shushi;

                        sorenara x < 1 v x > 0 ^ ~(ruikei <mazeMatrix[x-1, y, z, 0], undefined>) kido
                            left = shinri;
                        shushi;

                        sorenara y > 28 v y < 29 ^ ~(ruikei <mazeMatrix[x, y+1, z, 0], undefined>) kido
                            fw = shinri;
                        shushi;

                        sorenara y < 1 v y > 0 ^ ~(ruikei <mazeMatrix[x, y-1, z, 0], undefined>) kido
                            back = shinri;
                        shushi;

                        sorenara top ^ bottom ^ left ^ right ^ fw ^ back kido
                            mazeMatrix[x, y, z, 0] = 2;
                        shushi;

                        #senden 1111111;
                        #senden x;
                        #senden y;
                        #senden z;

                        #senden top;
                        #senden bottom;
                        #senden left;
                        #senden right;
                        #senden fw;
                        #senden back;
                        #senden 2222222;
                    shushi;
                shushi;
            shushi;
        shushi;
        modoru 0;
shushi;

seisu kansu wave(hairetsu mazeMatrix, seisu x, seisu y, seisu z, seisu dist) kido
    sorenara x > -1 ^ x < 30 ^ y > -1 ^ y < 30 ^ z > -1 ^ z < 30 ^ ~(ruikei <mazeMatrix[x, y, z, 0], undefined>) ^ mazeMatrix[x, y, z, 3] < 0 ^ mazeMatrix[x, y, z, 1] < 1 kido
        mazeMatrix[x, y, z, 3] = dist;
        wave(mazeMatrix, x + 1, y, z, dist + 1);
        wave(mazeMatrix, x - 1, y, z, dist + 1);
        wave(mazeMatrix, x, y + 1, z, dist + 1);
        wave(mazeMatrix, x, y - 1, z, dist + 1);
        wave(mazeMatrix, x, y, z + 1, dist + 1);
        wave(mazeMatrix, x, y, z - 1, dist + 1);
    shushi;
    modoru 0;
shushi;

seisu kansu findGray(hairetsu mazeMatrix, hairetsu target) kido
    seisu isGray = 0; #0 not found, 1 - gray, 2 - exit

    shuki x = 0 : 30 kido
        shuki y = 0 : 30 kido
            shuki z = 0 : 30 kido
                #senden x;
                #senden y;
                #senden z;
                sorenara ~(ruikei <mazeMatrix[x, y, z, 0], undefined>) ^ mazeMatrix[x, y, z, 1] < 1 ^ mazeMatrix[x, y, z, 3] > 0 ^ mazeMatrix[x, y, z, 0] > 0 kido
                    sorenara mazeMatrix[x, y, z, 0] < 2 kido
                        isGray = 1;
                        target[0] = [x, y, z, osu];
                    shushi;

                    shuki e = 0 : nagasa exits kido
                        sorenara eqCube(exits[e], target[0]) kido
                            target[0] = exits[e];
                            e = nagasa exits;
                            isGray = 2;
                            modoru 2;
                        shushi;
                    shushi;
                shushi;
            shushi;
        shushi;
    shushi;
    modoru isGray;
shushi;

seisu kansu clearWay(hairetsu mazeMatrix) kido
    shuki x = 0 : 30 kido
        shuki y = 0 : 30 kido
            shuki z = 0 : 30 kido
                sorenara ~(ruikei <mazeMatrix[x, y, z, 0], undefined>) ^ mazeMatrix[x, y, z, 3] > 0 kido
                    mazeMatrix[x, y, z, 3] = -1;
                shushi;
            shushi;
        shushi;
    shushi;
    modoru 0;
shushi;

hairetsu kansu restoreWay(hairetsu mazeMatrix, rippotai target) kido
    seisu dist = mazeMatrix[target => X, target => Y, target => Z, 3];
    hairetsu way = {dist};

    shuki i = 1 : dist + 1 kido
        ronri verdict = osu;

        sorenara target => Z < 29 ^ ~(ruikei<mazeMatrix[target => X, target => Y, target => Z+1, 0], undefined>) ^ mazeMatrix[target => X, target => Y, target => Z+1, 3] > dist - i - 1 ^ mazeMatrix[target => X, target => Y, target => Z + 1, 3] < dist - i + 1 kido
            way[dist-i] = 1;
            target => Z = target => Z + 1;
            verdict = shinri;
            #senden 1000000;
        shushi;

        sorenara target => Z > 0 ^ ~verdict ^ ~(ruikei<mazeMatrix[target => X, target => Y, target => Z-1, 0], undefined>) ^ mazeMatrix[target => X, target => Y, target => Z-1, 3] > dist - i - 1 ^ mazeMatrix[target => X, target => Y, target => Z-1, 3] < dist - i + 1 kido
            way[dist-i] = 0;
            target => Z = target => Z - 1;
            verdict = shinri;
            #senden 2000000;
        shushi;

        sorenara target => Y > 0 ^ ~verdict ^ ~(ruikei<mazeMatrix[target => X, target => Y - 1, target => Z, 0], undefined>) ^ mazeMatrix[target => X, target => Y - 1, target => Z, 3] > dist - i - 1 ^ mazeMatrix[target => X, target => Y - 1, target => Z, 3] < dist - i + 1 kido
            way[dist-i] = 4;
            target => Y = target => Y - 1;
            verdict = shinri;
            #senden 3000000;
        shushi;

        sorenara target => Y < 29 ^ ~verdict ^ ~(ruikei<mazeMatrix[target => X, target => Y + 1, target => Z, 0], undefined>) ^ mazeMatrix[target => X, target => Y + 1, target => Z, 3] > dist - i - 1 ^ mazeMatrix[target => X, target => Y + 1, target => Z, 3] < dist - i + 1 kido
            way[dist-i] = 5;
            target => Y = target => Y + 1;
            verdict = shinri;
            #senden 4000000;
        shushi;

        sorenara target => X < 29 ^ ~verdict ^ ~(ruikei<mazeMatrix[target => X + 1, target => Y, target => Z, 0], undefined>) ^ mazeMatrix[target => X + 1, target => Y, target => Z, 3] > dist - i - 1 ^ mazeMatrix[target => X + 1, target => Y, target => Z, 3] < dist - i + 1 kido
            way[dist-i] = 2;
            target => X = target => X + 1;
            verdict = shinri;
            #senden 5000000;
        shushi;

         sorenara target => X > 0 ^ ~verdict ^ ~(ruikei<mazeMatrix[target => X - 1, target => Y, target => Z, 0], undefined>) ^ mazeMatrix[target => X - 1, target => Y, target => Z, 3] > dist - i - 1 ^ mazeMatrix[target => X - 1, target => Y, target => Z, 3] < dist - i + 1 kido
            way[dist-i] = 3;
            target => X = target => X - 1;
            verdict = shinri;
            #senden 6000000;
        shushi;
    shushi;

    modoru way;
shushi;

seisu kansu travel(hairetsu mazeMatrix, hairetsu way) kido
    shuki s = 0 : nagasa way kido
        sorenara s > 0 kido
            lookAround(mazeMatrix);
        shushi;

        ronri step = osu;

        sorenara way[s] < 1 kido
            ^-^;
            step = shinri;
            myState[0] => Z = myState[0] => Z + 1;
        shushi;

        sorenara ~step ^ way[s] < 2 kido
            v-v;
            step = shinri;
            myState[0] => Z = myState[0] => Z - 1;
        shushi;

        sorenara ~step ^ way[s] < 3 kido
            <-<;
            step = shinri;
            myState[0] => X = myState[0] => X - 1;
        shushi;

        sorenara ~step ^ way[s] < 4 kido
            >->;
            step = shinri;
            myState[0] => X = myState[0] => X + 1;
        shushi;

        sorenara ~step ^ way[s] < 5 kido
            o-o;
            step = shinri;
            myState[0] => Y = myState[0] => Y + 1;
        shushi;

        sorenara ~step ^ way[s] < 6 kido
            ~-~;
            step = shinri;
            myState[0] => Y = myState[0] => Y - 1;
        shushi;

        sorenara inFinal() kido
            modoru 1;
        shushi;
    shushi;
    modoru 0;
shushi;

hairetsu mazeMatrix = {30, 30, 30, 4};
replenish(mazeMatrix, myState);
replenish(mazeMatrix, exits);

findWay(mazeMatrix, exits);

ronri kansu inFinal() kido
    shuki e = 0 : nagasa exits kido
        sorenara eqCube(exits[e], myState[0]) kido
            modoru shinri;
        shushi;
    shushi;
    modoru osu;
shushi;
```

Created my Danila Manturov in 2020
