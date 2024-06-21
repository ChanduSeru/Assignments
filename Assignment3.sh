#!/bin/bash
#function to count lines in file
count(){
    filename="$1"
    if [ -f "$filename" ]; then
        lines=$(wc -l < "$filename")
        echo "No Of lines in '$filename': $lines"
    else
        echo "File '$filename' not found"
    fi
}

echo "enter file"
read file
count "$file"