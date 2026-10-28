package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.youtube.common.util.MemoryMappedBuffer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class txf {
    public final int a;
    public int b;
    public final /* synthetic */ txl c;
    private final int d;
    private aigj e;
    private int f;

    public txf(txl txlVar, int i, int i2) {
        this.c = txlVar;
        this.d = i;
        this.a = i2;
    }

    public final SparseArray a() {
        return this.c.D;
    }

    public final File b(int i) {
        return new File(this.c.E, String.valueOf(i));
    }

    public final void c(int i, int i2) {
        txl txlVar = this.c;
        if (txlVar.m) {
            int i3 = txlVar.q;
            int iC = (int) txlVar.c((i << 3) + ((char) i3), i3 >>> 16);
            if (i2 < ((txlVar.s + 7) >>> 3)) {
                throw new IllegalStateException("Data offset is less than header size");
            }
            if (iC < i2) {
                throw new IllegalStateException("Size is less than item header size");
            }
        }
    }

    public final void d(aigj aigjVar, int i) {
        int iD;
        int i2;
        int iD2 = aigjVar.d();
        if (iD2 <= 0) {
            throw new IllegalArgumentException();
        }
        int i3 = 0;
        if (iD2 > this.d) {
            int i4 = MemoryMappedBuffer.i;
            aigj aigjVar2 = null;
            try {
                aigi aigiVar = new aigi(aigjVar.d());
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(aigiVar);
                    try {
                        aigjVar.m(gZIPOutputStream);
                        gZIPOutputStream.finish();
                        aigj aigjVarB = aigiVar.b();
                        if (aigjVar.d() <= aigjVarB.d() || aigjVarB.d() <= 0) {
                            gZIPOutputStream.close();
                            aigiVar.close();
                        } else {
                            gZIPOutputStream.close();
                            aigiVar.close();
                            aigjVar2 = aigjVarB;
                        }
                        if (aigjVar2 != null) {
                            i2 = 1;
                            aigjVar = aigjVar2;
                            iD = aigjVar2.d();
                        } else {
                            this.c.I(txb.m);
                            iD = iD2;
                            i2 = 0;
                        }
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        aigiVar.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException unused) {
            }
        } else {
            iD = iD2;
            i2 = 0;
        }
        long j = i;
        txl txlVar = this.c;
        if (iD > Math.min(j, ((1 << (txlVar.q >>> 16)) - 1) - ((long) ((txlVar.s + 7) >>> 3)))) {
            txlVar.I(txb.z);
        } else {
            i3 = iD;
        }
        this.e = aigjVar;
        this.f = i2;
        this.b = i3;
    }

    public final void e(int i, int i2) {
        txl txlVar = this.c;
        int i3 = txlVar.q;
        if (((int) txlVar.c((i << 3) + ((char) i3), i3 >>> 16)) == i2) {
            if (txlVar.a == null) {
                a().remove(i);
            } else {
                if (tym.n(b(i), txlVar.c)) {
                    return;
                }
                txlVar.I(txb.s);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(int i, int i2) {
        aigj aigjVar = this.e;
        txl txlVar = this.c;
        File file = txlVar.E;
        aigjVar.d();
        int i3 = txlVar.q;
        txlVar.c((i << 3) + ((char) i3), i3 >>> 16);
        int i4 = this.f;
        long j = txlVar.f + ((long) i);
        int i5 = this.a;
        int i6 = i5 & 7;
        int i7 = 3;
        int i8 = (1 << (i5 >>> 16)) - 1;
        long j2 = j + ((long) ((i5 >> 3) & 8191));
        Memory.pokeByte(j2, (byte) ((Memory.peekByte(j2) & (~(i8 << i6))) | ((i4 & i8) << i6)));
        int i9 = 0;
        if (this.b != 0) {
            long j3 = this.c.f + ((long) (i + i2));
            while (i9 < aigjVar.d()) {
                Memory.pokeByte(((long) i9) + j3, aigjVar.a(i9));
                i9++;
            }
            aigjVar.d();
        } else if (txlVar.a != null) {
            if (!txlVar.F) {
                tym.q(new tsp(file, i7), txlVar.c);
                txlVar.F = true;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(b(i), true);
                try {
                    aigjVar.m(fileOutputStream);
                    if (txlVar.O()) {
                        long jS = txl.s(aigjVar);
                        while (i9 < 8) {
                            fileOutputStream.write((byte) (255 & jS));
                            jS >>>= 8;
                            i9++;
                        }
                    }
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused) {
                this.c.I(txb.q);
            }
        } else {
            a().append(i, aigjVar);
        }
        g();
    }

    public final void g() {
        this.b = 0;
        this.f = 0;
        this.e = null;
    }
}
