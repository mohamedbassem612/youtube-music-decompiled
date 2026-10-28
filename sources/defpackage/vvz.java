package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vvz implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vvz(aaok aaokVar, String str, int i, Map map, aihf aihfVar, int i2) {
        this.$cid = i2;
        this.b = aaokVar;
        this.c = str;
        this.a = i;
        this.d = map;
        this.e = aihfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, nxl] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                Object obj = this.b;
                Object obj2 = this.d;
                return ((enu) this.e).t(this.a, (String) this.c, (String) obj2, (Bundle) obj);
            }
            Object obj3 = this.d;
            int i2 = zoy.a;
            asku askuVar = (asku) this.c;
            boolean z = askuVar.k;
            int i3 = this.a;
            Context context = (Context) this.b;
            String str = (String) obj3;
            Typeface typefaceB = this.e.b(context, str, i3, z);
            return typefaceB == null ? ackp.b(context, ahno.ae(str), i3, askuVar.k) : typefaceB;
        }
        String strEK = yno.eK((String) this.c);
        kth kthVar = new kth();
        kthVar.b.putInt("timeoutMs", this.a);
        vwd vwdVar = (vwd) ((aaok) this.b).d;
        vwdVar.g();
        String strO = vwdVar.j.p(strEK).o(this.d, kthVar);
        aihf aihfVar = (aihf) this.e;
        aihfVar.copyOnWrite();
        ajgu ajguVar = (ajgu) aihfVar.instance;
        ajgu ajguVar2 = ajgu.a;
        strO.getClass();
        ajguVar.c = 3;
        ajguVar.d = strO;
        return (ajgu) aihfVar.build();
    }

    public /* synthetic */ vvz(enu enuVar, int i, String str, String str2, Bundle bundle, int i2) {
        this.$cid = i2;
        this.e = enuVar;
        this.a = i;
        this.c = str;
        this.d = str2;
        this.b = bundle;
    }

    public /* synthetic */ vvz(nxl nxlVar, Context context, String str, int i, asku askuVar, int i2) {
        this.$cid = i2;
        this.e = nxlVar;
        this.b = context;
        this.d = str;
        this.a = i;
        this.c = askuVar;
    }
}
