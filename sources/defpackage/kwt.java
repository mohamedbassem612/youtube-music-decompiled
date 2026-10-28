package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kwt {
    public static final Object a = new Object();
    public final Context b;
    public final SharedPreferences c;
    public final String d;
    private final kwk e;
    private boolean f;

    public kwt(Context context, gcw gcwVar, kwk kwkVar, boolean z) {
        this.f = false;
        this.b = context;
        this.d = Integer.toString(gcwVar.h);
        this.c = context.getSharedPreferences("pcvmspf", 0);
        this.e = kwkVar;
        this.f = z;
    }

    public static String b(gcx gcxVar) {
        gcz gczVar = gcz.a;
        aihf aihfVarCreateBuilder = gczVar.createBuilder();
        gcz gczVar2 = gcxVar.b;
        if (gczVar2 == null) {
            gczVar2 = gczVar;
        }
        String str = gczVar2.c;
        aihfVarCreateBuilder.copyOnWrite();
        gcz gczVar3 = (gcz) aihfVarCreateBuilder.instance;
        str.getClass();
        gczVar3.b |= 1;
        gczVar3.c = str;
        gcz gczVar4 = gcxVar.b;
        if (gczVar4 == null) {
            gczVar4 = gczVar;
        }
        String str2 = gczVar4.d;
        aihfVarCreateBuilder.copyOnWrite();
        gcz gczVar5 = (gcz) aihfVarCreateBuilder.instance;
        str2.getClass();
        gczVar5.b |= 2;
        gczVar5.d = str2;
        gcz gczVar6 = gcxVar.b;
        if (gczVar6 == null) {
            gczVar6 = gczVar;
        }
        long j = gczVar6.f;
        aihfVarCreateBuilder.copyOnWrite();
        gcz gczVar7 = (gcz) aihfVarCreateBuilder.instance;
        gczVar7.b |= 8;
        gczVar7.f = j;
        gcz gczVar8 = gcxVar.b;
        if (gczVar8 == null) {
            gczVar8 = gczVar;
        }
        long j2 = gczVar8.g;
        aihfVarCreateBuilder.copyOnWrite();
        gcz gczVar9 = (gcz) aihfVarCreateBuilder.instance;
        gczVar9.b |= 16;
        gczVar9.g = j2;
        gcz gczVar10 = gcxVar.b;
        if (gczVar10 != null) {
            gczVar = gczVar10;
        }
        long j3 = gczVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        gcz gczVar11 = (gcz) aihfVarCreateBuilder.instance;
        gczVar11.b |= 4;
        gczVar11.e = j3;
        return ksv.a(((gcz) aihfVarCreateBuilder.build()).toByteArray());
    }

    public final File a(String str) {
        return new File(new File(this.b.getDir("pccache", 0), this.d), str);
    }

    public final String c() {
        return "FBAMTD".concat(String.valueOf(this.d));
    }

    public final String d() {
        return "LATMTD".concat(String.valueOf(this.d));
    }

    public final void e(int i, long j) {
        this.e.a(i, j);
    }

    public final void f(int i, long j, String str) {
        this.e.b(i, j, str);
    }

    public final gcz g(int i) {
        SharedPreferences sharedPreferences = this.c;
        String string = i == 1 ? sharedPreferences.getString(d(), null) : sharedPreferences.getString(c(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            return (gcz) aihn.parseFrom(gcz.a, aigj.v(ksv.b(string)), this.f ? ExtensionRegistryLite.a : ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik unused) {
            return null;
        } catch (NullPointerException unused2) {
            e(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            e(2032, jCurrentTimeMillis);
            return null;
        }
    }
}
