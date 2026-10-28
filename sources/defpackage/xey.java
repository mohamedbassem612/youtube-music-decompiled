package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xey implements Runnable {
    final /* synthetic */ wrf a;
    final /* synthetic */ List b;
    final /* synthetic */ xev c;
    final /* synthetic */ String d;
    final /* synthetic */ zvh e;
    final /* synthetic */ ztf f;
    final /* synthetic */ Throwable g;
    final /* synthetic */ xez h;

    public xey(xez xezVar, wrf wrfVar, List list, xev xevVar, String str, zvh zvhVar, ztf ztfVar, Throwable th) {
        this.a = wrfVar;
        this.b = list;
        this.c = xevVar;
        this.d = str;
        this.e = zvhVar;
        this.f = ztfVar;
        this.g = th;
        this.h = xezVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aihf aihfVarA = this.a.a();
        ArrayList arrayList = new ArrayList();
        for (aihf aihfVar : this.b) {
            alos alosVar = (alos) alou.a.createBuilder();
            try {
                alosVar.m54mergeFrom(((jrc) aihfVar.instance).e, ExtensionRegistryLite.getGeneratedRegistry());
                if (!this.c.d.contains(alot.a(((alou) alosVar.instance).c))) {
                    arrayList.add((alou) alosVar.build());
                }
            } catch (aiik e) {
                this.h.g(String.valueOf(getClass().getCanonicalName()).concat(" could not deserialize ClientEvent when retryOnError."), e);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        aihfVarA.copyOnWrite();
        alow alowVar = (alow) aihfVarA.instance;
        alow alowVar2 = alow.a;
        alowVar.f = alow.emptyProtobufList();
        aihfVarA.be(arrayList);
        alow alowVar3 = (alow) aihfVarA.build();
        String str = this.d;
        zvh zvhVar = this.e;
        aihf aihfVarCreateBuilder = null;
        if (!TextUtils.isEmpty(str) && alowVar3 != null) {
            String str2 = zvhVar.a;
            aihfVarCreateBuilder = jrc.a.createBuilder();
            aigj byteString = alowVar3.toByteString();
            aihfVarCreateBuilder.copyOnWrite();
            jrc jrcVar = (jrc) aihfVarCreateBuilder.instance;
            jrcVar.b |= 4;
            jrcVar.e = byteString;
            aihfVarCreateBuilder.copyOnWrite();
            jrc jrcVar2 = (jrc) aihfVarCreateBuilder.instance;
            jrcVar2.b |= 2;
            jrcVar2.d = "event_logging_fixed_batch_retry";
            aihfVarCreateBuilder.copyOnWrite();
            jrc jrcVar3 = (jrc) aihfVarCreateBuilder.instance;
            str.getClass();
            jrcVar3.b |= 16;
            jrcVar3.g = str;
            if (!TextUtils.isEmpty(str2)) {
                aihfVarCreateBuilder.copyOnWrite();
                jrc jrcVar4 = (jrc) aihfVarCreateBuilder.instance;
                str2.getClass();
                jrcVar4.b |= SemanticState.Focused;
                jrcVar4.j = str2;
            }
            boolean z = zvhVar.b;
            aihfVarCreateBuilder.copyOnWrite();
            jrc jrcVar5 = (jrc) aihfVarCreateBuilder.instance;
            jrcVar5.b |= SemanticState.Hidden;
            jrcVar5.k = z;
        }
        if (aihfVarCreateBuilder != null) {
            xez xezVar = this.h;
            xezVar.h();
            this.f.j(xezVar.a(), new ArrayList(Arrays.asList(aihfVarCreateBuilder)), this.g);
        }
    }
}
