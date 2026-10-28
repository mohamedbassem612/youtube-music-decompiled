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
/* JADX INFO: loaded from: classes.dex */
public final class jsr implements jss {
    private final boolean a;
    private final boolean b;
    private final Cipher c;
    private final SecretKeySpec d;
    private final SecureRandom e;
    private boolean f;
    private jta g;
    private final qv h;

    public jsr(File file, byte[] bArr, boolean z, boolean z2) {
        Cipher cipher;
        SecretKeySpec secretKeySpec;
        if (bArr != null) {
            if (bArr.length != 16) {
                throw new IllegalArgumentException();
            }
            try {
                int i = bwp.a;
                cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                secretKeySpec = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            if (z) {
                throw new IllegalArgumentException();
            }
            cipher = null;
            secretKeySpec = null;
        }
        this.b = z;
        this.c = cipher;
        this.d = secretKeySpec;
        this.a = z2;
        this.e = z ? new SecureRandom() : null;
        this.h = new qv(file);
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
    private final void h(HashMap map) throws Throwable {
        DataOutputStream dataOutputStream;
        try {
            OutputStream outputStreamG = this.h.g();
            jta jtaVar = this.g;
            if (jtaVar == null) {
                this.g = new jta(outputStreamG);
            } else {
                jtaVar.a(outputStreamG);
            }
            dataOutputStream = new DataOutputStream(this.g);
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
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.g, this.c));
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
                this.h.i(dataOutputStream);
                int i = bwp.a;
            } catch (Throwable th) {
                th = th;
                int i2 = bwp.a;
                afxw.h(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
        }
    }

    private final boolean i(HashMap map, SparseArray sparseArray) throws Throwable {
        qv qvVar = this.h;
        if (!qvVar.j()) {
            return true;
        }
        DataInputStream dataInputStream = null;
        try {
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(qvVar.f());
                    DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                    try {
                        int i = dataInputStream2.readInt();
                        if (i >= 0 && i <= 2) {
                            if ((dataInputStream2.readInt() & 1) != 0) {
                                if (this.c != null) {
                                    byte[] bArr = new byte[16];
                                    dataInputStream2.readFully(bArr);
                                    try {
                                        this.c.init(2, this.d, new IvParameterSpec(bArr));
                                        dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.c));
                                    } catch (InvalidAlgorithmParameterException e) {
                                        e = e;
                                        throw new IllegalStateException(e);
                                    } catch (InvalidKeyException e2) {
                                        e = e2;
                                        throw new IllegalStateException(e);
                                    }
                                }
                            } else if (this.b) {
                                this.f = true;
                            }
                            int i2 = dataInputStream2.readInt();
                            zhq zhqVar = zhq.ABR;
                            int iAf = 0;
                            for (int i3 = 0; i3 < i2; i3++) {
                                jsq jsqVarAg = hna.ag(i, dataInputStream2);
                                String str = jsqVarAg.b;
                                map.put(str, jsqVarAg);
                                sparseArray.put(jsqVarAg.a, str);
                                iAf += hna.af(jsqVarAg, i);
                            }
                            int i4 = dataInputStream2.readInt();
                            if (i4 == iAf) {
                                if (dataInputStream2.read() == -1) {
                                    int i5 = bwp.a;
                                    try {
                                        dataInputStream2.close();
                                        return true;
                                    } catch (IOException unused) {
                                        return true;
                                    }
                                }
                                if (this.a) {
                                    hna.ac("LegacyStorage - CachedContentIndex readFile isEOF is false", null);
                                }
                            } else if (this.a) {
                                hna.ac(a.bQ(iAf, i4, "LegacyStorage - CachedContentIndex readFile hashCode mismatch. File hash code: ", ", hashCode: "), null);
                            }
                        }
                        int i6 = bwp.a;
                        dataInputStream2.close();
                    } catch (IOException e3) {
                        e = e3;
                        dataInputStream = dataInputStream2;
                        if (this.a) {
                            hna.ac(jsq.c(e, "LegacyStorage - CachedContentIndex readFile IOException, with message: ", ", with stacktrace: "), e);
                        }
                        if (dataInputStream != null) {
                            int i7 = bwp.a;
                            dataInputStream.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            int i8 = bwp.a;
                            try {
                                dataInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused3) {
        }
        return false;
    }

    @Override // defpackage.jss
    public final void a(HashMap map, SparseArray sparseArray) {
        if (this.f) {
            throw new IllegalStateException();
        }
        System.currentTimeMillis();
        if (!i(map, sparseArray)) {
            map.clear();
            sparseArray.clear();
            this.h.h();
        }
        zhq zhqVar = zhq.ABR;
        System.currentTimeMillis();
    }

    @Override // defpackage.jss
    public final void b(HashMap map) throws Throwable {
        if (this.f) {
            h(map);
            this.f = false;
        }
    }

    @Override // defpackage.jss
    public final boolean c() {
        return true;
    }

    @Override // defpackage.jss
    public final boolean d() {
        return false;
    }

    @Override // defpackage.jss
    public final boolean e() {
        return false;
    }

    @Override // defpackage.jss
    public final void f() {
        this.f = true;
    }

    @Override // defpackage.jss
    public final void g() {
        this.f = true;
    }
}
