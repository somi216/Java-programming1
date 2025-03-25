cmd

새로파일 추가
git add .
git commit -m "3주차 코드 추가"
git push origin main

처음부터
로컬 프로젝트에서 Git 초기화
git init

모든 파일 추가
git add .

첫 커밋
git commit -m "주차별 코드 초기 업로드"

GitHub 원격 저장소 연결
git branch -M main
git remote add origin <your-repo-url>

GitHub로 push
git push -u origin main

안되면
git pull origin main --rebase
git push -u origin main
git push -f origin main 강제푸시



