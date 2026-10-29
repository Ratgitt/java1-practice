# Как сдавать задачи

Каждый блок сдаётся отдельно: **ветка `block-N` → pull request → ревью → merge**.

## Один раз

1. На странице этого репозитория: **Use this template → Create a new repository**. Имя `java1-practice`, **Private**.
2. В своём новом репозитории: **Settings → Collaborators → Add people** → `Ratgitt`.
3. Скопируй адрес репозитория (**Code** → HTTPS) и склонируй:
   - IDEA: **File → New → Project from Version Control** → вставь адрес → **Clone**;
   - или в терминале: `git clone <адрес>`.
4. При первом push IDEA попросит войти в GitHub — нажми **Log in via GitHub**. Пароль от аккаунта git не принимает.

## Каждый блок

**1. Создай ветку от свежего `main`**

```bash
git switch main
git pull
git switch -c block-1
```

**2. Решай и сохраняй** — после каждой задачи или пары задач:

```bash
git add .
git commit -m "block 1: tasks 1-3"
git push
```

Первый `git push` в новой ветке попросит `git push -u origin block-1` — так и введи.

**3. Открой pull request.** На странице своего репозитория появится кнопка **Compare & pull request**.
Проверь: `base: main ← compare: block-1`. Нажми **Create pull request**.

**4. Исправь замечания.** Преподаватель оставит комментарии к строкам. Исправляй в той же ветке,
снова `add` → `commit` → `push` — pull request обновится сам. Ответь на комментарии.

**5. Блок принят**, когда преподаватель нажмёт **Merge**. Следующий блок — снова с шага 1.

## То же самое в IDEA

| Действие | Где |
|---|---|
| Новая ветка, переключение | название ветки внизу справа (или вверху слева) |
| Обновить `main` | **Git → Pull** |
| Commit | **Ctrl+K** / **⌘K**: отметь файлы, напиши сообщение, **Commit** |
| Push | **Ctrl+Shift+K** / **⇧⌘K** |

## Если что-то пошло не так

- `git status` — показывает, в какой ты ветке и что изменено.
- Push отклонён (`rejected`) — сделай `git pull`, потом снова `git push`.
- Забыл создать ветку и закоммитил в `main` — не пушь, напиши преподавателю.
- Никогда не делай `git push --force` и не удаляй ветки — сначала спроси.
