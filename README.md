# ๐ Android Study week 10 ๋ชฉํ ๐
made by [bmsk](https://github.com/YiBeomSeok)

## ๐ธ git
- git ์ฌ์ฉ์ด ์ต์ํด์ก๋ค๋ฉด git flow ์ ๋ต์ ์ฐธ๊ณ ํ๋ค.
- ์ฃผ์ด์ง `feature/1-main-activity`๋ฅผ clone ํ ์๋ branch name์ ํด๋นํ๋ branch๋ก checkoutํด์ ์ํํ๋๋ก ํ๋ค.
- ๋ช๋ น์ด ์์
```shell
git clone --branch feature/1-main-activity <์ฃผ์>
git checkout -b <branch๋ช>
```

## ๐ธ branch name ๋ชฉ๋ก
- main
- develop
- feature/1-main-activity
- feature/2-maddy-activity
- feature/3-wbham-activity
- feature/4-Jaeeepp-activity
- feature/5-Arr-activity

## ๐ธ ์ต์ข branch

### ***main branch***
- main branch๋ฅผ ์ง์  ์์ ํ์ง ์๋๋ก ์ฃผ์ํ๋ค.
- develop branch์์์ ๋ชจ๋  ์์์ด ๋๋ฌ์ ๋ pull request๋ฅผ ํตํด ์์ ๋๋ค.

### ***develop branch***
- develop branch๋ฅผ ์ง์  ์์ ํ์ง ์๋๋ก ์ฃผ์ํ๋ค.
- branch๋ก์ merge๋ pull request๋ก ์งํํ๋ค.

## ๐ธ feature branch

### ๊ณตํต ์๊ตฌ ์ฌํญ
- ๊ทธ ์ธ ๋ค๋ฅธ branch์์ ์์ํ๋ ๊ธฐ๋ฅ์ ์์ ํ์ง ์๋๋ก ์ฃผ์ํ๋ค.
- ํด๋์ค ๋ช, ํจ์ ๋ช, ๋ณ์ ๋ช ๋ฑ ๊ทธ ์ด๋ฆ์ ์ฝ์์ ๋ ์ด๋ค ๊ธฐ๋ฅ์ ํ๋ ๊ฒ์ธ์ง ์ ์ถํ  ์ ์๊ฒ๋ ๋ธ๋ ฅํ๋ค.

### ***feature/1-main-activity***
- `MainActivity`์์ ๋ค๋ฅธ `Activity`๋ก ์ ํํ  ์ ์๋๋ก ๊ตฌํํ๋ค.

made by [bmsk](https://github.com/YiBeomSeok)

### ***feature/2-maddy-activity***
- UMC standard mission week9 ๋ด์ฉ์ ๊ตฌํํ๋ค.
- ํจ์ ๊ธธ์ด๊ฐ ๋๋ฌด ๊ธธ์ด์ง์ง ์๋๋ก ์ฃผ์ํ๋ค.

made by [Maddy](https://github.com/MADElinessss)

### ***feature/3-wbham-activity***
- UMC standard mission week9 ๋ด์ฉ์ ๊ตฌํํ๋ค.
- ์ด๋ค fragment A์์ `thread`๋ฅผ ์คํํ๊ณ  ๊ทธ `thread`๊ฐ ์ข๋ฃ๋์ง ์์ ์์ ์ ๋ค๋ฅธ fragment B๋ก ์ ํ๋  ๋ ๊ทธ `thread`์ ํ์ฌ ์งํ ์ํฉ์ `Log.d`๋ก ์ถ๋ ฅํ๋ค.

made by [wbham](https://github.com/WooBinHam)

### ***feature/4-Jaeeepp-activity***
- UMC standard mission week9 ๋ด์ฉ์ ๊ตฌํํ๋ค.
- retrofit2 ์ฌ์ฉ์ `Log.d`๋ก ์งํ ์ํฉ์ ์ถ๋ ฅํ๋ค.
  - TAG: GET or POST

made by [jaeeepp](https://github.com/Jaeeepp)

### ***feature/5-Arr-activity***
- UMC standard mission week9 ๋ด์ฉ์ ๊ตฌํํ๋ค.
- ํฌ๊ธฐ๊ฐ ํฐ ๋ฐ์ดํฐ๋ฅผ ๋ฐ์์ฌ ์ ์๋ค๋ฉด `MAP`์ผ๋ก ๋ด๊ณ  ํน์  `key`์ ํด๋นํ๋ `value`๋ฅผ `Log.d`๋ก ์ถ๋ ฅ ๋๋ text๋ก ๊ตฌํํ๋ค.

made by [Arr](https://github.com/LeeGa00)

## โ Commit convention
commit message๋ ๋ค์๊ณผ ๊ฐ์ด ์์ฑํ๋๋ก ํ๋ค.
- ๊ธฐ๋ฅ ๊ตฌํ: `[FEAT] ๋ณ๊ฒฝ ๋ด์ฉ(์ถ๊ฐ๋ ํด๋์ค๋ช, ์ถ๊ฐ๋ ํจ์๋ช ๋ฑ๋ฑ)`
- ๋ฒ๊ทธ ์์ : `[FIX] ๋ณ๊ฒฝ ๋ด์ฉ`
- ํ์คํธ: `[TEST] ํ์คํธ ์ฝ๋ ๋ด์ฉ`
- ๋ฆฌํํ ๋ง: `[REFACTOR] ์ด๋ค ๊ฐ์ ์ ์ํ ๋ณ๊ฒฝ์ธ์ง ์ค๋ช`
- ๊ทธ ์ธ๋ ์์ ๋กญ๊ฒ ์์ฑํ๋ ๊ฐ๋จ ๋ช๋ฃํ๊ฒ ์์ฑํ๋ค.
