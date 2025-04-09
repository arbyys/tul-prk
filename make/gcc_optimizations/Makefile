GCC := gcc
GCC_OPT1 :=
GCC_OPT2 := S 
OPT_LEVEL := 

INPUT := suboptima
INPUT_FULL := src/suboptima

all:
	@make -s opt OPT_LEVEL="O0"
	@make -s opt OPT_LEVEL=O1
	@make -s opt OPT_LEVEL=O2
	@make -s opt OPT_LEVEL=O3
	@make -s opt OPT_LEVEL=Os


     
opt:
	@if [ -z $(OPT_LEVEL) ]; then $(GCC) -$(GCC_OPT2) $(INPUT_FUL).c; else $(GCC) -$(GCC_OPT2) -$(OPT_LEVEL) $(INPUT_FULL).c; fi
	
	
	@mv $(INPUT).s $(INPUT)_$(OPT_LEVEL).asm	
	echo "Compilation done. The assembler source is in $(INPUT)_$(OPT_LEVEL).asm file."
	
	@if [ -z $(OPT_LEVEL) ]; then $(GCC) $(INPUT_FULL).c -o $(INPUT)_$(OPT_LEVEL); else $(GCC) -$(OPT_LEVEL) $(INPUT_FULL).c -o $(INPUT)_$(OPT_LEVEL); fi	
	echo "The runnable file is in the $(INPUT)_$(OPT_LEVEL) binary."

clean:
	rm -rf $(INPUT)*