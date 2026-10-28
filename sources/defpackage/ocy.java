package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ocy extends odl {
    private final Map a;
    private final Context b;
    private final obb c;
    private final long d;
    private final long e;
    private final omj f;

    public ocy(fxg fxgVar, ocu ocuVar, Map map, Context context, obb obbVar, oaq oaqVar, omj omjVar) {
        super("WRrNJ3FQlC6uYpskQI9/jcKlkyPIKxlx8wARdW34wSEm6VKghlkWreJdpvmqs1sv", "8rVANTfkyC31okTNQXUzqpf2FOVDgWzSNoXCC+JAlQ8=", fxgVar, ocuVar, omjVar.h(113));
        this.b = context;
        this.a = map;
        this.c = obbVar;
        this.f = omjVar;
        this.d = oaqVar.n;
        this.e = oaqVar.o;
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) {
        fxl fxlVar;
        Object[] objArr = (Object[]) method.invoke("", this.b, Integer.valueOf(this.c.ordinal()));
        objArr.getClass();
        String str = "E";
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.a.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (fxlVar = (fxl) listenableFuture.get(this.d, TimeUnit.MILLISECONDS)) != null && fxlVar.t.length() > 1 && !fxlVar.t.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
                str = fxlVar.t;
            }
        } catch (ClassCastException | ExecutionException unused) {
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        } catch (TimeoutException unused3) {
            this.f.j(SemanticState.Focused);
        }
        if (str.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.a.get("ai");
                if (listenableFuture2 != null) {
                    String str2 = (String) listenableFuture2.get(this.e, TimeUnit.MILLISECONDS);
                    if (!ahno.aa(str2)) {
                        str = str2;
                    }
                }
            } catch (ClassCastException | ExecutionException unused4) {
            } catch (InterruptedException unused5) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused6) {
                this.f.j(129);
            }
        }
        Boolean bool = (Boolean) objArr[5];
        Long l = (Long) objArr[6];
        synchronized (fxgVar) {
            Object obj = objArr[4];
            String strEncodeToString = obj instanceof byte[] ? Base64.encodeToString(agyg.f.f().j((byte[]) obj).getBytes(StandardCharsets.UTF_8), 11) : (String) obj;
            long jLongValue = ((Long) objArr[0]).longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar2 = (fxl) fxgVar.instance;
            fxl fxlVar3 = fxl.a;
            fxlVar2.b |= 536870912;
            fxlVar2.z = jLongValue;
            String str3 = (String) objArr[1];
            fxgVar.copyOnWrite();
            fxl fxlVar4 = (fxl) fxgVar.instance;
            str3.getClass();
            fxlVar4.b |= 268435456;
            fxlVar4.y = str3;
            String str4 = (String) objArr[2];
            fxgVar.copyOnWrite();
            fxl fxlVar5 = (fxl) fxgVar.instance;
            str4.getClass();
            fxlVar5.c |= SemanticState.Focused;
            fxlVar5.I = str4;
            String str5 = (String) objArr[3];
            fxgVar.copyOnWrite();
            fxl fxlVar6 = (fxl) fxgVar.instance;
            str5.getClass();
            fxlVar6.c |= SemanticState.Hidden;
            fxlVar6.J = str5;
            fxgVar.copyOnWrite();
            fxl fxlVar7 = (fxl) fxgVar.instance;
            strEncodeToString.getClass();
            fxlVar7.b |= 16777216;
            fxlVar7.u = strEncodeToString;
            fxgVar.copyOnWrite();
            fxl fxlVar8 = (fxl) fxgVar.instance;
            str.getClass();
            fxlVar8.b |= 4194304;
            fxlVar8.t = str;
            if (bool != null) {
                int i = true != bool.booleanValue() ? 1 : 2;
                fxgVar.copyOnWrite();
                fxl fxlVar9 = (fxl) fxgVar.instance;
                fxlVar9.ac = i - 1;
                fxlVar9.d |= 32;
            }
            if (l != null) {
                int iAX = kro.aX(l.intValue());
                if (iAX == 0) {
                    throw null;
                }
                fxgVar.copyOnWrite();
                fxl fxlVar10 = (fxl) fxgVar.instance;
                fxlVar10.ao = iAX - 1;
                fxlVar10.e |= SemanticState.ReadOnly;
            }
        }
    }
}
