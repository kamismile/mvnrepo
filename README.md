# mvnrepo
ffmpeg -y -i p1m.mp4 -s 1280*720 -vf "eq=contrast=1:brightness=0.02" -vcodec libx264 p1m-10.mp4
ffmpeg -i 1m.mov -frames:v 1 -f image2 -ss 00:02:06 1m-1.jpg
