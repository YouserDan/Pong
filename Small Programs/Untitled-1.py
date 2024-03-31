from random import getrandbits
from os import environ

FLAG: str = environ['FLAG']
SECRET: int = getrandbits(128)

print('''

`7MM"""YMM  `7MMF'      `7MMF'MMP""MM""YMM `7MM"""YMM        .g8"""bgd     db       .M"""bgd `7MMF'`7MN.   `7MF' .g8""8q.
  MM    `7    MM          MM  P'   MM   `7   MM    `7      .dP'     `M    ;MM:     ,MI    "Y   MM    MMN.    M .dP'    `YM.
  MM   d      MM          MM       MM        MM   d        dM'       `   ,V^MM.    `MMb.       MM    M YMb   M dM'      `MM
  MMmmMM      MM          MM       MM        MMmmMM        MM           ,M  `MM      `YMMNq.   MM    M  `MN. M MM        MM
  MM   Y  ,   MM      ,   MM       MM        MM   Y  ,     MM.          AbmmmqMA   .     `MM   MM    M   `MM.M MM.      ,MP
  MM     ,M   MM     ,M   MM       MM        MM     ,M     `Mb.     ,' A'     VML  Mb     dM   MM    M     YMM `Mb.    ,dP'
.JMMmmmmMMM .JMMmmmmMMM .JMML.   .JMML.    .JMMmmmmMMM       `"bmmmd'.AMA.   .AMMA.P"Ybmmd"  .JMML..JML.    YM   `"bmmd"'

''')

try:
    user_guess: str = input('Try guessing 128-bit integer: ')

    if eval(f'{SECRET} == "{user_guess}"', {'__builtins__': None}):
        print('Noooooo, our casino is poor! We know you love flags ;) *wink*')
        print(FLAG)
    else:
        print('Oooooh nyyyyyo, come back rich again :D')
except Exception:
    print('Error occurred! Refer to casino documentation: https://goo.su/app_docs (password: qwerty)')
