package defpackage;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bxl {
    private final bxk c;
    private bxj f;
    private final ArrayDeque d = new ArrayDeque();
    private final ArrayDeque e = new ArrayDeque();
    public final PriorityQueue a = new PriorityQueue();
    public int b = -1;

    public bxl(bxk bxkVar) {
        this.c = bxkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 >= r0.b) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r7, defpackage.bwb r9) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L92
            int r0 = r6.b
            if (r0 == 0) goto L93
            r1 = -1
            if (r0 == r1) goto L28
            java.util.PriorityQueue r0 = r6.a
            int r2 = r0.size()
            int r3 = r6.b
            if (r2 < r3) goto L28
            java.lang.Object r0 = r0.peek()
            bxj r0 = (defpackage.bxj) r0
            int r2 = defpackage.bwp.a
            long r2 = r0.b
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L93
        L28:
            java.util.ArrayDeque r0 = r6.d
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L36
            bwb r0 = new bwb
            r0.<init>()
            goto L3c
        L36:
            java.lang.Object r0 = r0.pop()
            bwb r0 = (defpackage.bwb) r0
        L3c:
            int r2 = r9.d()
            r0.L(r2)
            byte[] r2 = r9.b
            int r9 = r9.c
            byte[] r3 = r0.b
            r4 = 0
            int r5 = r0.d()
            java.lang.System.arraycopy(r2, r9, r3, r4, r5)
            bxj r9 = r6.f
            if (r9 == 0) goto L61
            long r2 = r9.b
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L61
            java.util.List r6 = r9.a
            r6.add(r0)
            goto L98
        L61:
            java.util.ArrayDeque r9 = r6.e
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L6f
            bxj r9 = new bxj
            r9.<init>()
            goto L75
        L6f:
            java.lang.Object r9 = r9.pop()
            bxj r9 = (defpackage.bxj) r9
        L75:
            java.util.List r2 = r9.a
            boolean r3 = r2.isEmpty()
            defpackage.ahno.O(r3)
            r9.b = r7
            r2.add(r0)
            java.util.PriorityQueue r7 = r6.a
            r7.add(r9)
            r6.f = r9
            int r7 = r6.b
            if (r7 == r1) goto L98
            r6.b(r7)
            goto L98
        L92:
            r7 = r0
        L93:
            bxk r6 = r6.c
            r6.a(r7, r9)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxl.a(long, bwb):void");
    }

    public final void b(int i) {
        List list;
        while (true) {
            PriorityQueue priorityQueue = this.a;
            if (priorityQueue.size() <= i) {
                return;
            }
            bxj bxjVar = (bxj) priorityQueue.poll();
            int i2 = bwp.a;
            int i3 = 0;
            while (true) {
                list = bxjVar.a;
                if (i3 >= list.size()) {
                    break;
                }
                this.c.a(bxjVar.b, (bwb) list.get(i3));
                this.d.push((bwb) list.get(i3));
                i3++;
            }
            list.clear();
            bxj bxjVar2 = this.f;
            if (bxjVar2 != null && bxjVar2.b == bxjVar.b) {
                this.f = null;
            }
            this.e.push(bxjVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final void c(int i) {
        ahno.O((i ^ (-1)) >>> 31);
        this.b = i;
        b(i);
    }
}
