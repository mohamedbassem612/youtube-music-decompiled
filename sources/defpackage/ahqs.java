package defpackage;

import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahqs {
    public static final ahqk a;
    public static final ahqk b;
    private static final Charset d = Charset.forName("UTF-8");
    private static final ahql e;
    public final Map c;
    private OutputStream f;
    private final Map g;
    private final ahql h;
    private final aedi i = new aedi();

    static {
        ahqj ahqjVar = new ahqj("key");
        ahqjVar.b(new ahqn(1, ahqq.a));
        a = ahqjVar.a();
        ahqj ahqjVar2 = new ahqj("value");
        ahqjVar2.b(new ahqn(2, ahqq.a));
        b = ahqjVar2.a();
        e = new ahqt(1);
    }

    public ahqs(OutputStream outputStream, Map map, Map map2, ahql ahqlVar) {
        this.f = outputStream;
        this.c = map;
        this.g = map2;
        this.h = ahqlVar;
    }

    private static int d(ahqk ahqkVar) {
        ahqr ahqrVar = (ahqr) ahqkVar.a(ahqr.class);
        if (ahqrVar != null) {
            return ahqrVar.a();
        }
        throw new ahqi("Field has no @Protobuf config");
    }

    private static ahqr e(ahqk ahqkVar) {
        ahqr ahqrVar = (ahqr) ahqkVar.a(ahqr.class);
        if (ahqrVar != null) {
            return ahqrVar;
        }
        throw new ahqi("Field has no @Protobuf config");
    }

    private static ByteBuffer f(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void g(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            int i2 = i & 127;
            OutputStream outputStream = this.f;
            if (j == 0) {
                outputStream.write(i2);
                return;
            } else {
                outputStream.write(i2 | SemanticState.Focused);
                i >>>= 7;
            }
        }
    }

    private final void h(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            int i = ((int) j) & 127;
            OutputStream outputStream = this.f;
            if (j2 == 0) {
                outputStream.write(i);
                return;
            } else {
                outputStream.write(i | SemanticState.Focused);
                j >>>= 7;
            }
        }
    }

    private final void i(ahql ahqlVar, ahqk ahqkVar, Object obj, boolean z) throws IOException {
        ahqo ahqoVar = new ahqo();
        try {
            OutputStream outputStream = this.f;
            this.f = ahqoVar;
            try {
                ahqlVar.a(obj, this);
                this.f = outputStream;
                long j = ahqoVar.a;
                ahqoVar.close();
                if (z && j == 0) {
                    return;
                }
                g((d(ahqkVar) << 3) | 2);
                h(j);
                ahqlVar.a(obj, this);
            } catch (Throwable th) {
                this.f = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                ahqoVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void a(ahqk ahqkVar, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return;
        }
        ahqr ahqrVarE = e(ahqkVar);
        int iOrdinal = ahqrVarE.b().ordinal();
        if (iOrdinal == 0) {
            g(ahqrVarE.a() << 3);
            g(i);
        } else if (iOrdinal == 1) {
            g(ahqrVarE.a() << 3);
            g((i << 1) ^ (i >> 31));
        } else if (iOrdinal == 2) {
            g((ahqrVarE.a() << 3) | 5);
            this.f.write(f(4).putInt(i).array());
        }
    }

    public final void b(ahqk ahqkVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        ahqr ahqrVarE = e(ahqkVar);
        int iOrdinal = ahqrVarE.b().ordinal();
        if (iOrdinal == 0) {
            g(ahqrVarE.a() << 3);
            h(j);
        } else if (iOrdinal == 1) {
            g(ahqrVarE.a() << 3);
            h((j << 1) ^ (j >> 63));
        } else if (iOrdinal == 2) {
            g((ahqrVarE.a() << 3) | 1);
            this.f.write(f(8).putLong(j).array());
        }
    }

    public final void c(ahqk ahqkVar, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (z && charSequence.length() == 0) {
                    return;
                }
                g((d(ahqkVar) << 3) | 2);
                byte[] bytes = charSequence.toString().getBytes(d);
                g(bytes.length);
                this.f.write(bytes);
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    c(ahqkVar, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    i(e, ahqkVar, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (z && dDoubleValue == 0.0d) {
                    return;
                }
                g((d(ahqkVar) << 3) | 1);
                this.f.write(f(8).putDouble(dDoubleValue).array());
                return;
            }
            if (obj instanceof Float) {
                float fFloatValue = ((Float) obj).floatValue();
                if (z && fFloatValue == 0.0f) {
                    return;
                }
                g((d(ahqkVar) << 3) | 5);
                this.f.write(f(4).putFloat(fFloatValue).array());
                return;
            }
            if (obj instanceof Number) {
                b(ahqkVar, ((Number) obj).longValue(), z);
                return;
            }
            if (obj instanceof Boolean) {
                a(ahqkVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return;
                }
                g((d(ahqkVar) << 3) | 2);
                g(bArr.length);
                this.f.write(bArr);
                return;
            }
            ahql ahqlVar = (ahql) this.c.get(obj.getClass());
            if (ahqlVar != null) {
                i(ahqlVar, ahqkVar, obj, z);
                return;
            }
            ahqm ahqmVar = (ahqm) this.g.get(obj.getClass());
            if (ahqmVar != null) {
                ahqmVar.a(obj, this.i);
                return;
            }
            if (obj instanceof ahqp) {
                a(ahqkVar, ((ahqp) obj).a(), true);
            } else if (obj instanceof Enum) {
                a(ahqkVar, ((Enum) obj).ordinal(), true);
            } else {
                i(this.h, ahqkVar, obj, z);
            }
        }
    }
}
