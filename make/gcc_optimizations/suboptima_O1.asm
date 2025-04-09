	.file	"suboptima.c"
	.text
	.section	.rodata.str1.8,"aMS",@progbits,1
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
.LFB23:
	.cfi_startproc
	endbr64
	subq	$8, %rsp
	.cfi_def_cfa_offset 16
	movl	%edi, %edx
	testl	%edi, %edi
	jle	.L2
	leaq	.LC0(%rip), %rsi
	movl	$1, %edi
	movl	$0, %eax
	call	__printf_chk@PLT
.L1:
	addq	$8, %rsp
	.cfi_remember_state
	.cfi_def_cfa_offset 8
	ret
.L2:
	.cfi_restore_state
	leaq	.LC1(%rip), %rsi
	movl	$1, %edi
	movl	$0, %eax
	call	__printf_chk@PLT
	jmp	.L1
	.cfi_endproc
.LFE23:
	.size	condition1, .-condition1
	.section	.rodata.str1.8
	.align 8
.LC2:
	.string	"The Condition 1 is always true so the if is removed at opt level 1 and only this message should be present in the output code."
	.section	.rodata.str1.1,"aMS",@progbits,1
.LC3:
	.string	"unreachable branch"
.LC4:
	.string	"This is for, %dth iteration."
	.text
	.globl	main
	.type	main, @function
main:
.LFB24:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	pushq	%rbx
	.cfi_def_cfa_offset 24
	.cfi_offset 3, -24
	subq	$8, %rsp
	.cfi_def_cfa_offset 32
	leaq	.LC2(%rip), %rdi
	call	puts@PLT
	movl	$1, %edi
	call	condition1
	movl	$-10, %edi
	call	condition1
	movl	$0, %ebx
	leaq	.LC3(%rip), %rbp
.L6:
	movl	%ebx, %edx
	leaq	.LC4(%rip), %rsi
	movl	$1, %edi
	movl	$0, %eax
	call	__printf_chk@PLT
	addl	$1, %ebx
	cmpl	$9, %ebx
	jg	.L7
.L9:
	testl	%ebx, %ebx
	jns	.L6
	movq	%rbp, %rsi
	movl	$1, %edi
	movl	$0, %eax
	call	__printf_chk@PLT
	movl	%ebx, %edx
	leaq	.LC4(%rip), %rsi
	movl	$1, %edi
	movl	$0, %eax
	call	__printf_chk@PLT
	addl	$1, %ebx
	cmpl	$11, %ebx
	jne	.L9
	leaq	.LC3(%rip), %rsi
	movl	$1, %edi
	movl	$0, %eax
	call	__printf_chk@PLT
	movl	$11, %edx
	leaq	.LC4(%rip), %rsi
	movl	$1, %edi
	movl	$0, %eax
	call	__printf_chk@PLT
.L7:
	movl	$0, %eax
	addq	$8, %rsp
	.cfi_def_cfa_offset 24
	popq	%rbx
	.cfi_def_cfa_offset 16
	popq	%rbp
	.cfi_def_cfa_offset 8
	ret
	.cfi_endproc
.LFE24:
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
