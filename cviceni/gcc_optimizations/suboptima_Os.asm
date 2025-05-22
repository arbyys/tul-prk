	.file	"suboptima.c"
	.text
	.section	.rodata.str1.1,"aMS",@progbits,1
.LC0:
	.string	"The value of i is %d - condition was true and you see this.\n"
.LC1:
	.string	"The value of i is %d - condition was false and you see this.\n"
	.text
	.globl	condition1
	.type	condition1, @function
condition1:
.LFB13:
	.cfi_startproc
	endbr64
	movl	%edi, %edx
	pushq	%rcx
	.cfi_def_cfa_offset 16
	leaq	.LC0(%rip), %rsi
	testl	%edi, %edi
	jg	.L5
	leaq	.LC1(%rip), %rsi
.L5:
	movl	$1, %edi
	xorl	%eax, %eax
	call	__printf_chk@PLT
	movl	$1, %eax
	popq	%rdx
	.cfi_def_cfa_offset 8
	ret
	.cfi_endproc
.LFE13:
	.size	condition1, .-condition1
	.section	.rodata.str1.1
.LC2:
	.string	"The Condition 1 is always true so the if is removed at opt level 1 and only this message should be present in the output code."
.LC3:
	.string	"This is for, %dth iteration."
	.section	.text.startup,"ax",@progbits
	.globl	main
	.type	main, @function
main:
.LFB14:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	leaq	.LC2(%rip), %rdi
	leaq	.LC3(%rip), %rbp
	pushq	%rbx
	.cfi_def_cfa_offset 24
	.cfi_offset 3, -24
	xorl	%ebx, %ebx
	pushq	%rcx
	.cfi_def_cfa_offset 32
	call	puts@PLT
	movl	$1, %edi
	call	condition1
	movl	$-10, %edx
	leaq	.LC1(%rip), %rsi
	xorl	%eax, %eax
	movl	$1, %edi
	call	__printf_chk@PLT
.L8:
	movl	%ebx, %edx
	movq	%rbp, %rsi
	movl	$1, %edi
	xorl	%eax, %eax
	call	__printf_chk@PLT
	incl	%ebx
	cmpl	$10, %ebx
	jne	.L8
	popq	%rdx
	.cfi_def_cfa_offset 24
	xorl	%eax, %eax
	popq	%rbx
	.cfi_def_cfa_offset 16
	popq	%rbp
	.cfi_def_cfa_offset 8
	ret
	.cfi_endproc
.LFE14:
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
