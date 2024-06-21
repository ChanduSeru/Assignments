arr=("mark" 90 "anu" 67 "ko")
echo "array ${arr[@]}" 
echo "length ${#arr[@]}" 
echo ${arr[*]} 
echo ${arr[0]} 
echo ${arr[2]:0:2} 
echo ${arr[2]:1} 
echo ${arr[2]:--1}
search_results=$(echo"{arr[@]} | grep -c mark")
replaced_result=$(echo "${arr[a]/mark/raju}")
echo $search_results
