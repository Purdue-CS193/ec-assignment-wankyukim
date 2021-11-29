#include <stdio.h>
#include <fcntl.h>
#include <stdlib.h>
#include <unistd.h>

/* 
 * This task has to do with memory management, which is very important when programming in C. You may have dealt with opening/closing files in CS180 before. 
 * Valgrind can be used to identify file descriptors (FDs) that have been left open. It is important to close FDs to prevent memory leaks.
 * Valgrind can also be used to identify unfreed memory. Memory is a limited resource, so it is important to free it.
 * To do this task:
 *      1) Compile/run the program: 
 *          cd src/C
 *          gcc -o valgrind_task valgrind_task.c 
 *          ./valgrind_task
 *      2) Run Valgrind:
 *          valgrind --leak-check=full --track-fds=yes valgrind_task
 *      3) Carefully read the output of the valgrind command. Take note of the "ERROR SUMMARY" and "FILE DESCRIPTORS: __ open at exit" sections.
 *          It is only normal for 3 file descriptors to be open at exit (standard in, standard out, standard error).
 *      4) TODO: Correct errors you have noted from the valgrind output.
 *          To close an open file descriptor, simply write: close(fd)
 *          Memory can be allocated with object = malloc(). To free this memory, call free(object) 
 *      5) To make sure you have added the changes correctly, recompile using the gcc command from step 1. Run the valgrind command from step 3 again.
 *          Verify that there are now 3 file descriptors open at exit and that 0 bytes of memory are in use at exit (see HEAP SUMMARY section).
 */ 
int main() {
    int file_descriptor = open("sample_file.txt", O_RDONLY);
    int * x = malloc(10 * sizeof(int));
    if (file_descriptor < 0) {
        perror("oops");
        exit(1);
    }
    printf("File descriptor fd opened\n");
}
