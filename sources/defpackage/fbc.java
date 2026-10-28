package defpackage;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fbc implements eua {
    private final ezv a;
    private final List b;
    private final boolean c;
    private final boolean d;
    private final ewv e;
    private final kyr f;

    public fbc(List list, boolean z, ewv ewvVar, boolean z2, boolean z3) {
        this.b = list;
        this.c = z;
        this.e = ewvVar;
        this.d = z2;
        this.f = z3 ? new kyr(list, ewvVar, (short[]) null) : null;
        this.a = new ezv(z3);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f A[LOOP:3: B:40:0x007d->B:41:0x007f, LOOP_END] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ ewf a(Object obj, int i, int i2, ety etyVar) throws Throwable {
        ByteBuffer byteBufferA;
        ewv ewvVar;
        byte[] bArr;
        boolean z;
        int size;
        int i3;
        InputStream inputStream = (InputStream) obj;
        if (!this.d || (ewvVar = this.e) == null) {
            byteBufferA = fff.a(inputStream, this.c);
        } else {
            boolean z2 = this.c;
            int i4 = fff.a;
            ArrayList<byte[]> arrayList = new ArrayList();
            int i5 = 0;
            do {
                bArr = null;
                try {
                    byte[] bArr2 = (byte[]) ewvVar.a(16384, byte[].class);
                    i3 = 0;
                    while (i3 < 16384) {
                        try {
                            int i6 = inputStream.read(bArr2, i3, 16384 - i3);
                            if (i6 == -1) {
                                break;
                            }
                            i3 += i6;
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            bArr = bArr2;
                            if (!z) {
                                if (bArr != null) {
                                    ewvVar.c(bArr);
                                }
                                size = arrayList.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    ewvVar.c((byte[]) arrayList.get(i7));
                                }
                            }
                            throw th;
                        }
                    }
                    if (i3 == 0) {
                        ewvVar.c(bArr2);
                        break;
                    }
                    arrayList.add(bArr2);
                    i5 += i3;
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } while (i3 >= 16384);
            ByteBuffer byteBufferAllocate = z2 ? ByteBuffer.allocate(i5) : ByteBuffer.allocateDirect(i5);
            for (byte[] bArr3 : arrayList) {
                int iMin = Math.min(i5, 16384);
                byteBufferAllocate.put(bArr3, 0, iMin);
                i5 -= iMin;
                ewvVar.c(bArr3);
            }
            arrayList.clear();
            try {
                byteBufferA = fff.b(byteBufferAllocate);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                if (!z) {
                    if (bArr != null) {
                        ewvVar.c(bArr);
                    }
                    size = arrayList.size();
                    while (i7 < size) {
                        ewvVar.c((byte[]) arrayList.get(i7));
                    }
                }
                throw th;
            }
        }
        kyr kyrVar = this.f;
        if (kyrVar != null) {
            etyVar = kyrVar.H(byteBufferA, etyVar);
        }
        return this.a.c(ImageDecoder.createSource(byteBufferA), i, i2, etyVar);
    }

    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ boolean b(Object obj, ety etyVar) {
        InputStream inputStream = (InputStream) obj;
        if (!this.d) {
            return true;
        }
        ewv ewvVar = this.e;
        return (ewvVar == null || ept.g(this.b, inputStream, ewvVar) == ImageHeaderParser$ImageType.UNKNOWN) ? false : true;
    }
}
