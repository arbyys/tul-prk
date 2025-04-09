	.file	"suboptima.c"
	.text
	.section	.rodata
	.align 8
.LC0:
	.string	"The value of i is %d - condition was true and you see this.\n"
	.align 8
.LC1:
	.string	"The value of i is %d - condition was false and you see this.\n"
	.text
	.globl	condition1
	.type	condition1, @function
condition1:
.LFB0:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movl	%edi, -4(%rbp)
	cmpl	$0, -4(%rbp)
	jle	.L2
	movl	-4(%rbp), %eax
	movl	%eax, %esi
	leaq	.LC0(%rip), %rdi
	movl	$0, %eax
	call	printf@PLT
	movl	$1, %eax
	jmp	.L3
.L2:
	movl	-4(%rbp), %eax
	movl	%eax, %esi
	leaq	.LC1(%rip), %rdi
	movl	$0, %eax
	call	printf@PLT
	movl	$1, %eax
.L3:
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE0:
	.size	condition1, .-condition1
	.section	.rodata
	.align 8
.LC2:
	.string	"The Condition 1 is always true so the if is removed at opt level 1 and only this message should be present in the output code."
.LC3:
	.string	"unreachable branch"
.LC4:
	.string	"This is for, %dth iteration."
	.text
	.globl	main
	.type	main, @function
main:
.LFB1:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	leaq	.LC2(%rip), %rdi
	call	puts@PLT
	movl	$1, %edi
	call	condition1
	movl	$-10, %edi
	call	condition1
	movl	$0, -4(%rbp)
	jmp	.L5
.L8:
	cmpl	$10, -4(%rbp)
	jle	.L6
	leaq	.LC3(%rip), %rdi
	movl	$0, %eax
	call	printf@PLT
	jmp	.L7
.L6:
	cmpl	$0, -4(%rbp)
	jns	.L7
	leaq	.LC3(%rip), %rdi
	movl	$0, %eax
	call	printf@PLT
.L7:
	movl	-4(%rbp), %eax
	movl	%eax, %esi
	leaq	.LC4(%rip), %rdi
	movl	$0, %eax
	call	printf@PLT
	addl	$1, -4(%rbp)
.L5:
	cmpl	$9, -4(%rbp)
	jle	.L8
	movl	$0, %eax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1:
	.size	main, .-main
	.ident	"GCC: (Ubuntu 9.4.0-1ubuntu1~20.04.2) 9.4.0"
	.section	.note.GNU-stack,"",@progbits
	.section	.note.gnu.property,"a"
	.align 8
	.long	 1f - 0f
	.long	 4f - 1f
	.long	 5
0:
	.string	 "GNU"
1:
	.align 8
	.long	 0xc0000002
	.long	 3f - 2f
2:
	.long	 0x3
3:
	.align 8
4:
