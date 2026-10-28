package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igf {
    static final Uri a = Uri.parse("https://www.youtube.com/api/stats/playback");
    static final Uri b = Uri.parse("https://www.youtube.com/api/stats/watchtime");
    static final Uri c = Uri.parse("https://s.youtube.com/api/stats/qoe");
    private final awmd d;
    private final zwb e;
    private MessageDigest f;
    private final ci g;

    public igf(awmd awmdVar, zwb zwbVar, ci ciVar) {
        this.d = awmdVar;
        this.e = zwbVar;
        this.g = ciVar;
    }

    private static amup c(String str, Uri uri) {
        tyt tytVar = new tyt(uri);
        tytVar.f("docid", str);
        tytVar.f("ns", "sl");
        String string = tytVar.a().toString();
        amun amunVar = amun.a;
        aihf aihfVarCreateBuilder = amunVar.createBuilder();
        amum amumVar = amum.VISITOR_ID;
        aihfVarCreateBuilder.copyOnWrite();
        amun amunVar2 = (amun) aihfVarCreateBuilder.instance;
        amunVar2.c = amumVar.m;
        amunVar2.b |= 1;
        amun amunVar3 = (amun) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = amunVar.createBuilder();
        amum amumVar2 = amum.USER_AUTH;
        aihfVarCreateBuilder2.copyOnWrite();
        amun amunVar4 = (amun) aihfVarCreateBuilder2.instance;
        amunVar4.c = amumVar2.m;
        amunVar4.b |= 1;
        amun amunVar5 = (amun) aihfVarCreateBuilder2.build();
        aihf aihfVarCreateBuilder3 = amunVar.createBuilder();
        amum amumVar3 = amum.PLUS_PAGE_ID;
        aihfVarCreateBuilder3.copyOnWrite();
        amun amunVar6 = (amun) aihfVarCreateBuilder3.instance;
        amunVar6.c = amumVar3.m;
        amunVar6.b |= 1;
        amun amunVar7 = (amun) aihfVarCreateBuilder3.build();
        aihf aihfVarCreateBuilder4 = amup.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        amup amupVar = (amup) aihfVarCreateBuilder4.instance;
        string.getClass();
        amupVar.b |= 1;
        amupVar.c = string;
        aihfVarCreateBuilder4.bz(amunVar3);
        aihfVarCreateBuilder4.bz(amunVar5);
        aihfVarCreateBuilder4.bz(amunVar7);
        return (amup) aihfVarCreateBuilder4.build();
    }

    private final String d(anyx anyxVar) {
        if (this.f == null) {
            try {
                this.f = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e) {
                zvp.a(zvn.b, zvm.n, ahno.Z(e.getMessage()));
                return null;
            }
        }
        zwb zwbVar = this.e;
        return Base64.encodeToString(this.f.digest(String.valueOf(anyxVar.getAndroidMediaStoreContentUri()).concat(String.valueOf(zwbVar.u() ? zwbVar.e().k() : this.g.aD(zwbVar.e()))).getBytes()), 11);
    }

    public final wjf a(anyx anyxVar) {
        ahno.F(anyxVar.h());
        aihh aihhVar = (aihh) alvt.a.createBuilder();
        alvw alvwVar = alvw.a;
        aihf aihfVarCreateBuilder = alvwVar.createBuilder();
        String title = anyxVar.getTitle();
        aihfVarCreateBuilder.copyOnWrite();
        alvw alvwVar2 = (alvw) aihfVarCreateBuilder.instance;
        title.getClass();
        alvwVar2.b |= 2;
        alvwVar2.d = title;
        String artistNames = anyxVar.getArtistNames();
        aihfVarCreateBuilder.copyOnWrite();
        alvw alvwVar3 = (alvw) aihfVarCreateBuilder.instance;
        artistNames.getClass();
        alvwVar3.b |= 8388608;
        alvwVar3.n = artistNames;
        aqmh thumbnailDetails = anyxVar.getThumbnailDetails();
        aihfVarCreateBuilder.copyOnWrite();
        alvw alvwVar4 = (alvw) aihfVarCreateBuilder.instance;
        thumbnailDetails.getClass();
        alvwVar4.m = thumbnailDetails;
        alvwVar4.b |= 262144;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jLongValue = anyxVar.getLengthMs().longValue() / 1000;
        aihfVarCreateBuilder.copyOnWrite();
        alvw alvwVar5 = (alvw) aihfVarCreateBuilder.instance;
        alvwVar5.b |= 4;
        alvwVar5.e = jLongValue;
        aihfVarCreateBuilder.copyOnWrite();
        alvw alvwVar6 = (alvw) aihfVarCreateBuilder.instance;
        alvwVar6.b |= 16777216;
        alvwVar6.o = true;
        anzw anzwVar = anzw.MUSIC_VIDEO_TYPE_ATV;
        aihfVarCreateBuilder.copyOnWrite();
        alvw alvwVar7 = (alvw) aihfVarCreateBuilder.instance;
        alvwVar7.p = anzwVar.k;
        alvwVar7.b |= 67108864;
        alvw alvwVar8 = (alvw) aihfVarCreateBuilder.build();
        aihhVar.copyOnWrite();
        alvt alvtVar = (alvt) aihhVar.instance;
        alvwVar8.getClass();
        alvtVar.g = alvwVar8;
        alvtVar.b |= 8;
        aihh aihhVar2 = (aihh) alvl.a.createBuilder();
        aony aonyVar = aony.OK;
        aihhVar2.copyOnWrite();
        alvl alvlVar = (alvl) aihhVar2.instance;
        alvlVar.c = aonyVar.k;
        alvlVar.b |= 1;
        aihhVar2.copyOnWrite();
        alvl alvlVar2 = (alvl) aihhVar2.instance;
        alvlVar2.b |= SemanticState.Focused;
        alvlVar2.i = true;
        aihhVar2.copyOnWrite();
        alvl alvlVar3 = (alvl) aihhVar2.instance;
        alvlVar3.b |= SemanticState.Multiline;
        alvlVar3.o = true;
        aihf aihfVarCreateBuilder2 = alvd.a.createBuilder();
        aihf aihfVarCreateBuilder3 = ajjn.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        ajjn ajjnVar = (ajjn) aihfVarCreateBuilder3.instance;
        ajjnVar.b |= 1;
        ajjnVar.c = true;
        aihfVarCreateBuilder2.copyOnWrite();
        alvd alvdVar = (alvd) aihfVarCreateBuilder2.instance;
        ajjn ajjnVar2 = (ajjn) aihfVarCreateBuilder3.build();
        ajjnVar2.getClass();
        alvdVar.c = ajjnVar2;
        alvdVar.b = 64657230;
        aihhVar2.copyOnWrite();
        alvl alvlVar4 = (alvl) aihhVar2.instance;
        alvd alvdVar2 = (alvd) aihfVarCreateBuilder2.build();
        alvdVar2.getClass();
        alvlVar4.m = alvdVar2;
        alvlVar4.b |= SemanticState.Modal;
        aihf aihfVarCreateBuilder4 = alvc.a.createBuilder();
        aihf aihfVarCreateBuilder5 = ajhi.a.createBuilder();
        aihfVarCreateBuilder5.copyOnWrite();
        ajhi ajhiVar = (ajhi) aihfVarCreateBuilder5.instance;
        ajhiVar.b |= 1;
        ajhiVar.c = true;
        aihfVarCreateBuilder4.copyOnWrite();
        alvc alvcVar = (alvc) aihfVarCreateBuilder4.instance;
        ajhi ajhiVar2 = (ajhi) aihfVarCreateBuilder5.build();
        ajhiVar2.getClass();
        alvcVar.c = ajhiVar2;
        alvcVar.b |= 1;
        aihhVar2.copyOnWrite();
        alvl alvlVar5 = (alvl) aihhVar2.instance;
        alvc alvcVar2 = (alvc) aihfVarCreateBuilder4.build();
        alvcVar2.getClass();
        alvlVar5.n = alvcVar2;
        alvlVar5.b |= SemanticState.Obscured;
        aihf aihfVarCreateBuilder6 = aoia.a.createBuilder();
        aihfVarCreateBuilder6.copyOnWrite();
        aoia aoiaVar = (aoia) aihfVarCreateBuilder6.instance;
        aoiaVar.b |= 1;
        aoiaVar.c = false;
        aoia aoiaVar2 = (aoia) aihfVarCreateBuilder6.build();
        aihf aihfVarCreateBuilder7 = alvh.a.createBuilder();
        aihfVarCreateBuilder7.copyOnWrite();
        alvh alvhVar = (alvh) aihfVarCreateBuilder7.instance;
        aoiaVar2.getClass();
        alvhVar.c = aoiaVar2;
        alvhVar.b = 60572968;
        aihhVar2.copyOnWrite();
        alvl alvlVar6 = (alvl) aihhVar2.instance;
        alvh alvhVar2 = (alvh) aihfVarCreateBuilder7.build();
        alvhVar2.getClass();
        alvlVar6.p = alvhVar2;
        alvlVar6.b |= 32768;
        alvl alvlVar7 = (alvl) aihhVar2.build();
        aihhVar.copyOnWrite();
        alvt alvtVar2 = (alvt) aihhVar.instance;
        alvlVar7.getClass();
        alvtVar2.f = alvlVar7;
        alvtVar2.b |= 4;
        aihf aihfVarCreateBuilder8 = StreamingDataOuterClass$StreamingData.b.createBuilder();
        aihh aihhVar3 = (aihh) alaw.b.createBuilder();
        String androidMediaStoreContentUri = anyxVar.getAndroidMediaStoreContentUri();
        aihhVar3.copyOnWrite();
        alaw alawVar = (alaw) aihhVar3.instance;
        androidMediaStoreContentUri.getClass();
        alawVar.c |= 2;
        alawVar.f = androidMediaStoreContentUri;
        int i = wgq.RAW.ep;
        aihhVar3.copyOnWrite();
        alaw alawVar2 = (alaw) aihhVar3.instance;
        alawVar2.c |= 1;
        alawVar2.e = i;
        aihf aihfVarCreateBuilder9 = ajhl.a.createBuilder();
        String title2 = anyxVar.getTitle();
        aihfVarCreateBuilder9.copyOnWrite();
        ajhl ajhlVar = (ajhl) aihfVarCreateBuilder9.instance;
        title2.getClass();
        ajhlVar.b |= 1;
        ajhlVar.c = title2;
        aihfVarCreateBuilder9.copyOnWrite();
        ajhl ajhlVar2 = (ajhl) aihfVarCreateBuilder9.instance;
        ajhlVar2.b |= 4;
        ajhlVar2.e = true;
        aihhVar3.copyOnWrite();
        alaw alawVar3 = (alaw) aihhVar3.instance;
        ajhl ajhlVar3 = (ajhl) aihfVarCreateBuilder9.build();
        ajhlVar3.getClass();
        alawVar3.y = ajhlVar3;
        alawVar3.c |= 524288;
        aihfVarCreateBuilder8.cr(aihhVar3);
        StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = (StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder8.build();
        String strD = d(anyxVar);
        if (strD != null) {
            aihf aihfVarCreateBuilder10 = alvm.a.createBuilder();
            amup amupVarC = c(strD, c);
            aihfVarCreateBuilder10.copyOnWrite();
            alvm alvmVar = (alvm) aihfVarCreateBuilder10.instance;
            amupVarC.getClass();
            alvmVar.i = amupVarC;
            alvmVar.b |= 32;
            amup amupVarC2 = c(strD, a);
            aihfVarCreateBuilder10.copyOnWrite();
            alvm alvmVar2 = (alvm) aihfVarCreateBuilder10.instance;
            amupVarC2.getClass();
            alvmVar2.c = amupVarC2;
            alvmVar2.b |= 1;
            amup amupVarC3 = c(strD, b);
            aihfVarCreateBuilder10.copyOnWrite();
            alvm alvmVar3 = (alvm) aihfVarCreateBuilder10.instance;
            amupVarC3.getClass();
            alvmVar3.e = amupVarC3;
            alvmVar3.b |= 4;
            alvm alvmVar4 = (alvm) aihfVarCreateBuilder10.build();
            aihhVar.copyOnWrite();
            alvt alvtVar3 = (alvt) aihhVar.instance;
            alvmVar4.getClass();
            alvtVar3.k = alvmVar4;
            alvtVar3.b |= 64;
        }
        wjb wjbVar = (wjb) this.d.io();
        aihf aihfVarCreateBuilder11 = alvwVar.createBuilder();
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long jLongValue2 = anyxVar.getLengthMs().longValue() / 1000;
        aihfVarCreateBuilder11.copyOnWrite();
        alvw alvwVar9 = (alvw) aihfVarCreateBuilder11.instance;
        alvwVar9.b |= 4;
        alvwVar9.e = jLongValue2;
        wja wjaVarA = wjbVar.a(streamingDataOuterClass$StreamingData, (alvw) aihfVarCreateBuilder11.build());
        aihhVar.copyOnWrite();
        alvt alvtVar4 = (alvt) aihhVar.instance;
        streamingDataOuterClass$StreamingData.getClass();
        alvtVar4.h = streamingDataOuterClass$StreamingData;
        alvtVar4.b |= 16;
        wji wjiVar = new wji((alvt) aihhVar.build(), 0L, wjaVarA);
        if (strD != null) {
            wjiVar.i.d("docid", strD);
        }
        wjiVar.i.d("ns", "sl");
        return wjiVar;
    }

    public final wjf b(Context context, int i) {
        aihh aihhVar = (aihh) alvl.a.createBuilder();
        aony aonyVar = aony.UNPLAYABLE;
        aihhVar.copyOnWrite();
        alvl alvlVar = (alvl) aihhVar.instance;
        alvlVar.c = aonyVar.k;
        alvlVar.b |= 1;
        String string = context.getString(i);
        aihhVar.copyOnWrite();
        alvl alvlVar2 = (alvl) aihhVar.instance;
        string.getClass();
        alvlVar2.b |= 4;
        alvlVar2.e = string;
        alvl alvlVar3 = (alvl) aihhVar.build();
        aihh aihhVar2 = (aihh) alvt.a.createBuilder();
        alvw alvwVar = alvw.a;
        aihhVar2.copyOnWrite();
        alvt alvtVar = (alvt) aihhVar2.instance;
        alvwVar.getClass();
        alvtVar.g = alvwVar;
        alvtVar.b |= 8;
        aihhVar2.copyOnWrite();
        alvt alvtVar2 = (alvt) aihhVar2.instance;
        alvlVar3.getClass();
        alvtVar2.f = alvlVar3;
        alvtVar2.b |= 4;
        return new wji((alvt) aihhVar2.build(), 0L, (wja) null);
    }
}
