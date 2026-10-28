package defpackage;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.blocks.runtime.BaseClient;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mav implements maw {
    private final afyj a;
    private final Set b;

    public mav(Container container, maw mawVar) {
        this.b = ahng.aj();
        afyw afywVar = new afyw(1);
        aihf aihfVarCreateBuilder = asbo.a.createBuilder();
        String str = ((adcu) mawVar).a;
        aihfVarCreateBuilder.copyOnWrite();
        asbo asboVar = (asbo) aihfVarCreateBuilder.instance;
        asboVar.b |= 1;
        asboVar.c = str;
        this.a = (afyj) container.c(afywVar, (asbo) aihfVarCreateBuilder.build());
    }

    static final asbw f(BaseClient baseClient, Optional optional) {
        aihf aihfVarCreateBuilder = asbw.a.createBuilder();
        String strH = baseClient.h();
        aihfVarCreateBuilder.copyOnWrite();
        asbw asbwVar = (asbw) aihfVarCreateBuilder.instance;
        strH.getClass();
        asbwVar.b |= 2;
        asbwVar.d = strH;
        aigj byteString = g(baseClient.a(), optional).toByteString();
        aihfVarCreateBuilder.copyOnWrite();
        asbw asbwVar2 = (asbw) aihfVarCreateBuilder.instance;
        asbwVar2.b |= 1;
        asbwVar2.c = byteString;
        return (asbw) aihfVarCreateBuilder.build();
    }

    private static final asbp g(int i, Optional optional) {
        aihf aihfVarCreateBuilder = asbp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asbp asbpVar = (asbp) aihfVarCreateBuilder.instance;
        asbpVar.b |= 1;
        asbpVar.c = i;
        if (optional.isPresent()) {
            Object obj = optional.get();
            aihfVarCreateBuilder.copyOnWrite();
            asbp asbpVar2 = (asbp) aihfVarCreateBuilder.instance;
            asbpVar2.b |= 2;
            asbpVar2.d = (String) obj;
        }
        return (asbp) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.maw
    public final String a() {
        aihf aihfVarCreateBuilder = asbo.a.createBuilder();
        String strH = this.a.h();
        aihfVarCreateBuilder.copyOnWrite();
        asbo asboVar = (asbo) aihfVarCreateBuilder.instance;
        strH.getClass();
        asboVar.b |= 1;
        asboVar.c = strH;
        return ((asbo) aihfVarCreateBuilder.build()).c;
    }

    public final void b(BaseClient baseClient) {
        this.a.j(f(baseClient, Optional.empty()));
        this.b.add(baseClient);
    }

    public final void c(BaseClient baseClient, String str) {
        this.a.j(f(baseClient, Optional.of(str)));
        this.b.add(baseClient);
    }

    public final void d(BaseClient baseClient) {
        asbw asbwVarF = f(baseClient, Optional.empty());
        afyj afyjVar = this.a;
        afyjVar.i();
        aigv aigvVar = aigv.a;
        this.b.remove(baseClient);
    }

    public final byte[] e(int i, Optional optional) {
        byte[] byteArray = g(i, optional).toByteArray();
        afyj afyjVar = this.a;
        return afyjVar.nativeGetKeyedSignal(afyjVar.a, byteArray, 1);
    }

    public mav(Container container) {
        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
        this.a = (afyj) container.a(new afyw(1));
    }
}
