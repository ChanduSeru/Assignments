count(){
    filename="$1"
    if [ -f "$filename" ]; then
        #character count
        c=$(cat "$filename" | wc -c)
        #word count
        w=$(cat "$filename" | wc -w)
        #lines count
        lines=$(grep -c "." "$filename")
        echo "no of characters in '$filename' is $c"
        echo "no of words in '$filename' is $w"
        echo "no of lines in '$filename' is $lines"
    else
        echo "File '$filename' not found"
    fi
}

echo "enter file"
read file
count "$file"