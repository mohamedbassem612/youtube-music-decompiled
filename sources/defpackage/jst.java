package defpackage;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jst implements jss {
    private final boolean a;
    private final boolean b;
    private final Cipher c;
    private final SecretKeySpec d;
    private final SecureRandom e;
    private final zgu f;
    private boolean g;
    private jta h;
    private boolean i;
    private boolean j;
    private boolean k;

    public jst(File file, byte[] bArr, boolean z, boolean z2) {
        Cipher cipher;
        SecretKeySpec secretKeySpec;
        if (bArr != null) {
            ahno.F(bArr.length == 16);
            try {
                int i = bwp.a;
                cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                secretKeySpec = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            ahno.F(!z);
            cipher = null;
            secretKeySpec = null;
        }
        this.b = z;
        this.c = cipher;
        this.d = secretKeySpec;
        this.a = z2;
        this.e = z ? new SecureRandom() : null;
        this.f = z2 ? new zgw(file) : new zgv(file);
        this.i = false;
        this.k = false;
        this.j = true;
    }

    private final void h() throws Throwable {
        DataInputStream dataInputStream;
        zgu zguVar = this.f;
        if (!zguVar.g()) {
            throw new IOException("AtomicFile does not exist");
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(zguVar.a());
            dataInputStream = new DataInputStream(bufferedInputStream);
            try {
                int i = dataInputStream.readInt();
                if (i < 0 || i > 2) {
                    throw new IOException(a.bR(i, "Invalid version: "));
                }
                if ((dataInputStream.readInt() & 1) != 0) {
                    Cipher cipher = this.c;
                    if (cipher == null) {
                        throw new IOException("Cipher is null on verification");
                    }
                    byte[] bArr = new byte[16];
                    dataInputStream.readFully(bArr);
                    try {
                        cipher.init(2, this.d, new IvParameterSpec(bArr));
                        dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.c));
                    } catch (InvalidAlgorithmParameterException e) {
                        e = e;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    }
                }
                int i2 = dataInputStream.readInt();
                int iAf = 0;
                for (int i3 = 0; i3 < i2; i3++) {
                    iAf += hna.af(hna.ag(i, dataInputStream), i);
                }
                int i4 = dataInputStream.readInt();
                if (i4 != iAf) {
                    throw new IOException("File hash code mismatch on verification");
                }
                int i5 = dataInputStream.read();
                if (i5 == -1) {
                    int i6 = bwp.a;
                    afxw.h(dataInputStream);
                    return;
                }
                throw new IOException("Expected EOF not found on verification. scanForAesPadding: " + hna.ab(k(i5, dataInputStream)) + ", fileHashCode: " + i4 + ", hashCode: " + iAf);
            } catch (Throwable th) {
                th = th;
                if (dataInputStream != null) {
                    int i7 = bwp.a;
                    afxw.h(dataInputStream);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dataInputStream = null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void i(HashMap map) throws Throwable {
        DataOutputStream dataOutputStream;
        try {
            OutputStream outputStreamB = this.f.b();
            jta jtaVar = this.h;
            if (jtaVar == null) {
                this.h = new jta(outputStreamB);
            } else {
                jtaVar.a(outputStreamB);
            }
            dataOutputStream = new DataOutputStream(this.h);
            try {
                dataOutputStream.writeInt(2);
                boolean z = this.b;
                dataOutputStream.writeInt(z ? 1 : 0);
                if (z) {
                    byte[] bArr = new byte[16];
                    this.e.nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.c.init(1, this.d, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.h, this.c));
                    } catch (InvalidAlgorithmParameterException e) {
                        e = e;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(map.size());
                int iAf = 0;
                for (jsq jsqVar : map.values()) {
                    dataOutputStream.writeInt(jsqVar.a);
                    dataOutputStream.writeUTF(jsqVar.b);
                    axfd.ac(jsqVar.d, dataOutputStream);
                    iAf += hna.af(jsqVar, 2);
                }
                dataOutputStream.writeInt(iAf);
                this.f.d(dataOutputStream);
                this.f.e();
                int i = bwp.a;
                try {
                    h();
                } catch (IOException e3) {
                    if (this.a) {
                        hna.ac("StorageV2 - CachedContentIndex writeFile verification failed with message: ".concat(String.valueOf(e3.getMessage())), e3);
                    }
                    throw e3;
                }
            } catch (Throwable th) {
                th = th;
                this.f.e();
                int i2 = bwp.a;
                afxw.h(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
        }
    }

    private final boolean j(HashMap map, SparseArray sparseArray) throws Throwable {
        this.i = false;
        this.j = true;
        this.k = false;
        zgu zguVar = this.f;
        if (zguVar.g()) {
            DataInputStream dataInputStream = null;
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(zguVar.a());
                    DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                    try {
                        int i = dataInputStream2.readInt();
                        if (i < 0 || i > 2) {
                            int i2 = bwp.a;
                            afxw.h(dataInputStream2);
                            return false;
                        }
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            Cipher cipher = this.c;
                            if (cipher == null) {
                                if (this.a) {
                                    hna.ac("CachedContentIndex readFile; cipher is null", null);
                                }
                                int i3 = bwp.a;
                                afxw.h(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                cipher.init(2, this.d, new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.c));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.b) {
                            this.g = true;
                        }
                        int i4 = dataInputStream2.readInt();
                        zhq zhqVar = zhq.ABR;
                        int iAf = 0;
                        for (int i5 = 0; i5 < i4; i5++) {
                            jsq jsqVarAg = hna.ag(i, dataInputStream2);
                            String str = jsqVarAg.b;
                            map.put(str, jsqVarAg);
                            sparseArray.put(jsqVarAg.a, str);
                            iAf += hna.af(jsqVarAg, i);
                        }
                        int i6 = dataInputStream2.readInt();
                        if (i6 != iAf) {
                            if (this.a) {
                                hna.ac(a.bQ(iAf, i6, "StorageV2 - CachedContentIndex readFile hashCode mismatch. File hash code: ", ", hashCode: "), null);
                            }
                            this.i = true;
                            int i7 = bwp.a;
                            afxw.h(dataInputStream2);
                            return false;
                        }
                        int i8 = dataInputStream2.read();
                        if (i8 != -1) {
                            this.j = false;
                            int iK = k(i8, dataInputStream2);
                            if (this.a) {
                                hna.ac("StorageV2 - Expected EOF not found on readFile. paddingTypeDetectedOnInit: " + hna.ab(iK) + ", fileHashCode: " + i6 + ", hashCode: " + iAf, null);
                            }
                            int i9 = bwp.a;
                            afxw.h(dataInputStream2);
                            return false;
                        }
                        int i10 = bwp.a;
                        afxw.h(dataInputStream2);
                    } catch (IOException e3) {
                        e = e3;
                        dataInputStream = dataInputStream2;
                        if (this.a) {
                            hna.ac(jsq.c(e, "StorageV2 - CachedContentIndex readFile IOException, with message: ", ", with stacktrace: "), e);
                        }
                        this.k = true;
                        if (dataInputStream == null) {
                            return false;
                        }
                        int i11 = bwp.a;
                        afxw.h(dataInputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            int i12 = bwp.a;
                            afxw.h(dataInputStream);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e4) {
                e = e4;
            }
        }
        return true;
    }

    private static final int k(int i, DataInputStream dataInputStream) {
        if (i <= 0 || i > 16) {
            return 2;
        }
        int i2 = 1;
        while (i2 <= 16) {
            int i3 = dataInputStream.read();
            if (i3 == -1) {
                if (i == i2) {
                    return 3;
                }
                return i2 < i ? 4 : 2;
            }
            if (i3 != i) {
                return 2;
            }
            i2++;
        }
        return 2;
    }

    @Override // defpackage.jss
    public final void a(HashMap map, SparseArray sparseArray) {
        ahno.O(!this.g);
        System.currentTimeMillis();
        if (!j(map, sparseArray)) {
            map.clear();
            sparseArray.clear();
            this.f.c();
        }
        zhq zhqVar = zhq.ABR;
        System.currentTimeMillis();
    }

    @Override // defpackage.jss
    public final void b(HashMap map) throws Throwable {
        if (this.g) {
            i(map);
            this.g = false;
        }
    }

    @Override // defpackage.jss
    public final boolean c() {
        return this.j;
    }

    @Override // defpackage.jss
    public final boolean d() {
        return this.i;
    }

    @Override // defpackage.jss
    public final boolean e() {
        return this.k;
    }

    @Override // defpackage.jss
    public final void f() {
        this.g = true;
    }

    @Override // defpackage.jss
    public final void g() {
        this.g = true;
    }
}
