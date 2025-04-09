#! /usr/bin/gawk -f
#http://alohakun.blog7.fc2.c...

BEGIN {RS = "~@"; printf "digraph G {\n node [shape = record];";}

/^[0-9]/{

s = sprintf("\n%s [label = \"{%s | {", $1, $1);

for(i = 2; i < NF; i++)

s = s sprintf("%s | ", $i);

s = s sprintf("%s}}\"];", $i);

$0 = s;

while (/([a-zA-Z0-9]+):@([0-9]+)/){

format = sprintf("\\1 \\3\n %s:\\1 -> \\2;", $1);

$0 = gensub(/([a-zA-Z0-9]+):@([0-9]+)(.*)$/, format, "g");

};

printf " %s", $0;

}

END {print "\n}"}