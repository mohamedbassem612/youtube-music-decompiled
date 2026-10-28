package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import j$.util.DesugarCollections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sll {
    public static final /* synthetic */ int a = 0;
    private static final wje b = new wje(alvm.a);

    public static wjf a(wjb wjbVar, aivg aivgVar, wiu wiuVar) {
        aivgVar.getClass();
        aihf aihfVarCreateBuilder = StreamingDataOuterClass$StreamingData.b.createBuilder();
        for (aivh aivhVar : aivgVar.b) {
            if (!aivhVar.d.isEmpty() && !TextUtils.equals(aivhVar.d, "null/null") && !aivhVar.e.isEmpty()) {
                aihh aihhVar = (aihh) alaw.b.createBuilder();
                String strTrim = aivhVar.e.trim();
                aihhVar.copyOnWrite();
                alaw alawVar = (alaw) aihhVar.instance;
                strTrim.getClass();
                alawVar.c |= 2;
                alawVar.f = strTrim;
                String str = aivhVar.d;
                aihhVar.copyOnWrite();
                alaw alawVar2 = (alaw) aihhVar.instance;
                str.getClass();
                alawVar2.c |= 4;
                alawVar2.g = str;
                int i = aivhVar.b;
                aihhVar.copyOnWrite();
                alaw alawVar3 = (alaw) aihhVar.instance;
                alawVar3.c |= 64;
                alawVar3.l = i;
                int i2 = aivhVar.c;
                aihhVar.copyOnWrite();
                alaw alawVar4 = (alaw) aihhVar.instance;
                alawVar4.c |= 32;
                alawVar4.k = i2;
                aihfVarCreateBuilder.cr(aihhVar);
            }
        }
        if (DesugarCollections.unmodifiableList(((StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.instance).e).isEmpty()) {
            return null;
        }
        StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = (StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = alvw.a.createBuilder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = ((long) aivgVar.c) / 1000;
        aihfVarCreateBuilder2.copyOnWrite();
        alvw alvwVar = (alvw) aihfVarCreateBuilder2.instance;
        alvwVar.b |= 4;
        alvwVar.e = j;
        return new wji(wjbVar.a(streamingDataOuterClass$StreamingData, (alvw) aihfVarCreateBuilder2.build()), b, wiuVar);
    }
}
