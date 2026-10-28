package defpackage;

import android.text.TextUtils;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.zip.CRC32;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yfz {
    final String a;
    public final String b;
    public final File c;
    abxv d;
    private final Cipher e;
    private final SecretKeySpec f;
    private final SecureRandom g;
    private final xeu h;

    public yfz(zjr zjrVar, xeu xeuVar, String str, String str2, byte[] bArr, byte[] bArr2) {
        this.h = xeuVar;
        String str3 = "media" + File.separator + "cache";
        this.a = str + File.separator + str3;
        String str4 = str2 + File.separator + str3;
        this.b = str4;
        this.c = new File(str4);
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        try {
            this.e = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f = secretKeySpec;
            this.g = new SecureRandom();
            this.d = new abxv(Cipher.getInstance("AES/CBC/PKCS5PADDING"), secretKeySpec, new IvParameterSpec(bArr2), zjrVar);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean i(File file) {
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return file.delete();
        }
        for (File file2 : fileArrListFiles) {
            if (!i(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    private final synchronized yfx l(ygb ygbVar) {
        yfx yfxVar;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(ygbVar.e.G());
        try {
            Cipher cipher = this.e;
            cipher.init(2, this.f, ivParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal((ygbVar.c == 3 ? (aigj) ygbVar.d : aigj.d).G());
            try {
                yfxVar = (yfx) aihn.parseFrom(yfx.a, bArrDoFinal, ExtensionRegistryLite.getGeneratedRegistry());
                CRC32 crc32 = new CRC32();
                crc32.update(bArrDoFinal);
                if (crc32.getValue() != (((long) ygbVar.f) & 4294967295L)) {
                    throw new yga();
                }
            } catch (aiik e) {
                throw new IOException(e);
            }
        } catch (InvalidAlgorithmParameterException e2) {
            e = e2;
            throw new IllegalStateException(e);
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new IllegalStateException(e);
        } catch (BadPaddingException e4) {
            e = e4;
            throw new IllegalStateException(e);
        } catch (IllegalBlockSizeException e5) {
            e = e5;
            throw new IllegalStateException(e);
        }
        return yfxVar;
    }

    private final synchronized ygb m(yfx yfxVar) {
        aihf aihfVarCreateBuilder;
        byte[] bArr = new byte[16];
        this.g.nextBytes(bArr);
        aigj aigjVarV = aigj.v(bArr);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        byte[] byteArray = yfxVar.toByteArray();
        try {
            Cipher cipher = this.e;
            cipher.init(1, this.f, ivParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray);
            aihfVarCreateBuilder = ygb.a.createBuilder();
            int value = (int) crc32.getValue();
            aihfVarCreateBuilder.copyOnWrite();
            ygb ygbVar = (ygb) aihfVarCreateBuilder.instance;
            ygbVar.b |= 2;
            ygbVar.f = value;
            aihfVarCreateBuilder.copyOnWrite();
            ygb ygbVar2 = (ygb) aihfVarCreateBuilder.instance;
            aigjVarV.getClass();
            ygbVar2.b |= 1;
            ygbVar2.e = aigjVarV;
            aigj aigjVarV2 = aigj.v(bArrDoFinal);
            aihfVarCreateBuilder.copyOnWrite();
            ygb ygbVar3 = (ygb) aihfVarCreateBuilder.instance;
            aigjVarV2.getClass();
            ygbVar3.c = 3;
            ygbVar3.d = aigjVarV2;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
            throw new IllegalStateException(e);
        }
        return (ygb) aihfVarCreateBuilder.build();
    }

    private final synchronized agkz n(File file) {
        agkz agkzVarN;
        if (file.exists()) {
            zkf.c(file.isDirectory());
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || (fileArrListFiles.length) <= 0) {
                agkzVarN = agpr.a;
            } else {
                HashSet hashSet = new HashSet();
                for (File file2 : fileArrListFiles) {
                    String name = file2.getName();
                    try {
                        hashSet.add(this.d.h(name));
                    } catch (IllegalArgumentException e) {
                        zik.bB(this.h, 2, new IllegalStateException("eid." + name + ";f." + file2.isFile(), e));
                    } catch (IllegalStateException e2) {
                        zik.bB(this.h, 2, e2);
                    }
                }
                agkzVarN = agkz.n(hashSet);
            }
        } else {
            agkzVarN = agpr.a;
        }
        return agkzVarN;
    }

    public final synchronized yfx a(String str) {
        BufferedInputStream bufferedInputStream;
        ygb ygbVar;
        try {
            bufferedInputStream = new BufferedInputStream(k(this.a, str).f());
            try {
                ygbVar = (ygb) aihn.parseFrom(ygb.a, bufferedInputStream, ExtensionRegistryLite.getGeneratedRegistry());
                int i = bwp.a;
                try {
                    bufferedInputStream.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                th = th;
                int i2 = bwp.a;
                afxw.h(bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
        return l(ygbVar);
    }

    public final synchronized agkz b() {
        return n(this.c);
    }

    public final synchronized agkz c() {
        return n(new File(this.a));
    }

    public final File d(String str, ygk ygkVar, long j) {
        return new File(f(this.b, str, ygkVar) + File.separator + j);
    }

    public final String e(String str) {
        return this.d.j(str);
    }

    public final String f(String str, String str2, ygk ygkVar) {
        String string;
        String str3 = File.separator;
        String strE = e(str2);
        String str4 = File.separator;
        String str5 = ygkVar.b;
        if (TextUtils.isEmpty(str5)) {
            int i = ygkVar.a;
            long j = ygkVar.c;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('_');
            sb.append(j);
            string = sb.toString();
        } else {
            string = ygkVar.a + '_' + ygkVar.c + '_' + str5;
        }
        return str + str3 + strE + str4 + string;
    }

    public final synchronized void g(yfx yfxVar) {
        h(m(yfxVar), yfxVar.c);
    }

    final synchronized void h(ygb ygbVar, String str) {
        BufferedOutputStream bufferedOutputStream;
        try {
            try {
                String str2 = this.a;
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                qv qvVarK = k(str2, str);
                bufferedOutputStream = new BufferedOutputStream(qvVarK.g());
                try {
                    ygbVar.writeTo(bufferedOutputStream);
                    qvVarK.i(bufferedOutputStream);
                    int i = bwp.a;
                } catch (Throwable th) {
                    th = th;
                    int i2 = bwp.a;
                    afxw.h(bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }

    public final void j(String str) {
        if (i(new File(this.b + File.separator + e(str)))) {
            k(this.a, str).h();
        }
    }

    final qv k(String str, String str2) {
        return new qv(new File(str + File.separator + e(str2)));
    }
}
