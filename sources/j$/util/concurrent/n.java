package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class n {
    public j[] a;
    public j b = null;
    public m c;
    public m d;
    public int e;
    public int f;
    public int g;
    public final int h;

    public n(j[] jVarArr, int i, int i2, int i3) {
        this.a = jVarArr;
        this.h = i;
        this.e = i2;
        this.f = i2;
        this.g = i3;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a A[LOOP:1: B:33:0x005d->B:37:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0006 A[EDGE_INSN: B:63:0x0006->B:60:0x0006 BREAK  A[LOOP:1: B:33:0x005d->B:37:0x006a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0006 A[EDGE_INSN: B:64:0x0006->B:60:0x0006 BREAK  A[LOOP:1: B:33:0x005d->B:37:0x006a], SYNTHETIC] */
    public final j a() {
        j[] jVarArr;
        int length;
        int i;
        m mVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        j jVar = this.b;
        if (jVar != null) {
            jVar = jVar.d;
        }
        while (jVar == null) {
            if (this.f >= this.g || (jVarArr = this.a) == null || (length = jVarArr.length) <= (i = this.e) || i < 0) {
                this.b = null;
                return null;
            }
            j jVarK = ConcurrentHashMap.k(jVarArr, i);
            if (jVarK == null || jVarK.a >= 0) {
                jVar = jVarK;
                if (this.c != null) {
                    while (true) {
                        mVar = this.c;
                        i2 = this.e;
                        if (mVar != null) {
                            i3 = i2 + this.h;
                            this.e = i3;
                            if (i3 >= length) {
                                break;
                            }
                            int i7 = this.f + 1;
                            this.f = i7;
                            this.e = i7;
                            break;
                        }
                        i4 = mVar.a;
                        i5 = i2 + i4;
                        this.e = i5;
                        if (i5 >= length) {
                            break;
                        }
                        this.e = mVar.b;
                        this.a = mVar.c;
                        mVar.c = null;
                        m mVar2 = mVar.d;
                        mVar.d = this.d;
                        this.c = mVar2;
                        this.d = mVar;
                        length = i4;
                    }
                } else {
                    i6 = i + this.h;
                    this.e = i6;
                    if (i6 >= length) {
                        int i8 = this.f + 1;
                        this.f = i8;
                        this.e = i8;
                    }
                }
            } else if (jVarK instanceof f) {
                this.a = ((f) jVarK).e;
                m mVar3 = this.d;
                if (mVar3 != null) {
                    this.d = mVar3.d;
                } else {
                    mVar3 = new m();
                }
                mVar3.c = jVarArr;
                mVar3.a = length;
                mVar3.b = i;
                mVar3.d = this.c;
                this.c = mVar3;
                jVar = null;
            } else {
                jVar = jVarK instanceof o ? ((o) jVarK).f : null;
                if (this.c != null) {
                    while (true) {
                        mVar = this.c;
                        i2 = this.e;
                        if (mVar != null) {
                            i3 = i2 + this.h;
                            this.e = i3;
                            if (i3 >= length) {
                                break;
                                break;
                            }
                            int i9 = this.f + 1;
                            this.f = i9;
                            this.e = i9;
                            break;
                            break;
                        }
                        i4 = mVar.a;
                        i5 = i2 + i4;
                        this.e = i5;
                        if (i5 >= length) {
                            break;
                            break;
                        }
                        this.e = mVar.b;
                        this.a = mVar.c;
                        mVar.c = null;
                        m mVar4 = mVar.d;
                        mVar.d = this.d;
                        this.c = mVar4;
                        this.d = mVar;
                        length = i4;
                    }
                } else {
                    i6 = i + this.h;
                    this.e = i6;
                    if (i6 >= length) {
                        int i10 = this.f + 1;
                        this.f = i10;
                        this.e = i10;
                    }
                }
            }
        }
        this.b = jVar;
        return jVar;
    }
}
