package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tol {
    public int a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map h;
    public ainp i;

    public tol(String str, tmr tmrVar) {
        this.b = str;
        this.a = tmrVar.a.a().length;
        tmt tmtVar = tmrVar.b;
        this.c = tmtVar.d;
        this.d = tmtVar.f;
        this.e = tmtVar.e;
        this.f = tmtVar.g;
        this.g = tmtVar.h;
        this.h = tmtVar.c;
        this.i = tmtVar.j;
    }

    static int a(InputStream inputStream) {
        return m(inputStream) | (m(inputStream) << 8) | (m(inputStream) << 16) | (m(inputStream) << 24);
    }

    static long b(InputStream inputStream) {
        return (((long) m(inputStream)) & 255) | ((((long) m(inputStream)) & 255) << 8) | ((((long) m(inputStream)) & 255) << 16) | ((((long) m(inputStream)) & 255) << 24) | ((((long) m(inputStream)) & 255) << 32) | ((((long) m(inputStream)) & 255) << 40) | ((((long) m(inputStream)) & 255) << 48) | ((((long) m(inputStream)) & 255) << 56);
    }

    static tol d(InputStream inputStream) throws IOException {
        tol tolVar = new tol();
        if (a(inputStream) != 539296001) {
            throw new IOException();
        }
        tolVar.a = a(inputStream);
        tolVar.b = f(inputStream);
        String strF = f(inputStream);
        tolVar.c = strF;
        if (strF.isEmpty()) {
            tolVar.c = null;
        }
        tolVar.d = b(inputStream);
        tolVar.e = b(inputStream);
        tolVar.f = b(inputStream);
        tolVar.g = b(inputStream);
        int iA = a(inputStream);
        Map treeMap = iA == 0 ? Collections.EMPTY_MAP : new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < iA; i++) {
            treeMap.put(f(inputStream).intern(), f(inputStream).intern());
        }
        tolVar.h = treeMap;
        if (inputStream.read() == 1) {
            tolVar.i = (ainp) ainp.parseDelimitedFrom(ainp.a, inputStream, ExtensionRegistryLite.getGeneratedRegistry());
        } else {
            tolVar.i = null;
        }
        return tolVar;
    }

    public static String e(String str) {
        return String.valueOf(str.hashCode());
    }

    static String f(InputStream inputStream) {
        return new String(i(inputStream, (int) b(inputStream)), StandardCharsets.UTF_8);
    }

    static void g(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void h(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        yno.J(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] i(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException(a.cj(i2, i, "Expected ", " bytes, read ", " bytes"));
    }

    static /* synthetic */ String j(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int i = inputStream.read();
            if (i == -1) {
                throw new EOFException();
            }
            if (i == 10) {
                int length = sb.length();
                if (length > 0) {
                    int i2 = length - 1;
                    if (sb.charAt(i2) == '\r') {
                        sb.setLength(i2);
                    }
                }
                return sb.toString();
            }
            sb.append((char) i);
        }
    }

    static /* synthetic */ void k(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException(a.bU((byte) 34, str, "keys must not contain spaces or newlines: \""));
        }
    }

    private static int m(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public final tmr c(byte[] bArr) {
        aftj aftjVar = new aftj();
        aftjVar.j(tmt.a);
        aftjVar.a = new tmh(bArr);
        tms tmsVarA = tmt.a();
        tmsVarA.a = this.c;
        tmsVarA.b(this.d);
        tmsVarA.e(this.e);
        tmsVarA.g(this.f);
        tmsVarA.f(this.g);
        tmsVarA.d(this.h);
        tmsVarA.c = this.i;
        aftjVar.j(tmsVarA.a());
        return aftjVar.i();
    }

    public final void l(OutputStream outputStream) {
        try {
            g(outputStream, 539296001);
            g(outputStream, this.a);
            h(outputStream, this.b);
            h(outputStream, typ.c(this.c));
            yno.J(outputStream, this.d);
            yno.J(outputStream, this.e);
            yno.J(outputStream, this.f);
            yno.J(outputStream, this.g);
            Map map = this.h;
            if (map != null) {
                g(outputStream, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    h(outputStream, (String) entry.getKey());
                    h(outputStream, (String) entry.getValue());
                }
            } else {
                g(outputStream, 0);
            }
            outputStream.write(this.i != null ? 1 : 0);
            ainp ainpVar = this.i;
            if (ainpVar != null) {
                ainpVar.writeDelimitedTo(outputStream);
            }
            outputStream.flush();
        } catch (IOException unused) {
        }
    }
}
