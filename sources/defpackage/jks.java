package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jks {
    public static final anqm a = anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_LIST_ITEMS;
    public static final String b = wfs.e(424, "music_library_item_view_mode_entity");
    private final Context c;
    private final wco d;
    private final zwb e;
    private final Executor f;

    public jks(Context context, wco wcoVar, zwb zwbVar, Executor executor) {
        this.c = context;
        this.d = wcoVar;
        this.e = zwbVar;
        this.f = executor;
    }

    private static final ajwo c(anqm anqmVar, ajwo ajwoVar) {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = anzq.b;
        aihf aihfVarCreateBuilder = anzq.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anzq anzqVar = (anzq) aihfVarCreateBuilder.instance;
        anzqVar.d = anqmVar.d;
        anzqVar.c |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anzq anzqVar2 = (anzq) aihfVarCreateBuilder.instance;
        ajwoVar.getClass();
        anzqVar2.e = ajwoVar;
        anzqVar2.c |= 2;
        aihhVar.e(aihlVar, (anzq) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    public final ListenableFuture a() {
        return afxd.f(tzk.e(this.d.b(this.e.e()).g(b).g(anqk.class))).g(new iua(20), this.f);
    }

    public final apji b(ajwo ajwoVar, anqm anqmVar) {
        aihh aihhVar = (aihh) apji.a.createBuilder();
        aihl aihlVar = ajnp.b;
        aihf aihfVarCreateBuilder = ajno.a.createBuilder();
        anqm anqmVar2 = anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_GRID_ITEMS;
        aihfVarCreateBuilder.copyOnWrite();
        ajno ajnoVar = (ajno) aihfVarCreateBuilder.instance;
        ajnoVar.b |= 2;
        ajnoVar.c = anqmVar == anqmVar2;
        alja aljaVar = alja.a;
        aihh aihhVar2 = (aihh) aljaVar.createBuilder();
        aliz alizVar = aliz.GRID;
        aihhVar2.copyOnWrite();
        alja aljaVar2 = (alja) aihhVar2.instance;
        aljaVar2.c = alizVar.yN;
        aljaVar2.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        ajno ajnoVar2 = (ajno) aihfVarCreateBuilder.instance;
        alja aljaVar3 = (alja) aihhVar2.build();
        aljaVar3.getClass();
        ajnoVar2.e = aljaVar3;
        ajnoVar2.b |= 32;
        aiqe aiqeVar = aiqe.a;
        aihf aihfVarCreateBuilder2 = aiqeVar.createBuilder();
        aiqd aiqdVar = aiqd.a;
        aihf aihfVarCreateBuilder3 = aiqdVar.createBuilder();
        Context context = this.c;
        String string = context.getString(R.string.accessibility_grid_view_toggle);
        aihfVarCreateBuilder3.copyOnWrite();
        aiqd aiqdVar2 = (aiqd) aihfVarCreateBuilder3.instance;
        string.getClass();
        aiqdVar2.b |= 2;
        aiqdVar2.c = string;
        aihfVarCreateBuilder2.copyOnWrite();
        aiqe aiqeVar2 = (aiqe) aihfVarCreateBuilder2.instance;
        aiqd aiqdVar3 = (aiqd) aihfVarCreateBuilder3.build();
        aiqdVar3.getClass();
        aiqeVar2.c = aiqdVar3;
        aiqeVar2.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        ajno ajnoVar3 = (ajno) aihfVarCreateBuilder.instance;
        aiqe aiqeVar3 = (aiqe) aihfVarCreateBuilder2.build();
        aiqeVar3.getClass();
        ajnoVar3.l = aiqeVar3;
        ajnoVar3.b |= 1048576;
        ajwo ajwoVarC = c(anqmVar2, ajwoVar);
        aihfVarCreateBuilder.copyOnWrite();
        ajno ajnoVar4 = (ajno) aihfVarCreateBuilder.instance;
        ajwoVarC.getClass();
        ajnoVar4.g = ajwoVarC;
        ajnoVar4.b |= SemanticState.LiveRegion;
        aihh aihhVar3 = (aihh) aljaVar.createBuilder();
        aliz alizVar2 = aliz.LIST;
        aihhVar3.copyOnWrite();
        alja aljaVar4 = (alja) aihhVar3.instance;
        aljaVar4.c = alizVar2.yN;
        aljaVar4.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        ajno ajnoVar5 = (ajno) aihfVarCreateBuilder.instance;
        alja aljaVar5 = (alja) aihhVar3.build();
        aljaVar5.getClass();
        ajnoVar5.h = aljaVar5;
        ajnoVar5.b |= SemanticState.Obscured;
        aihf aihfVarCreateBuilder4 = aiqeVar.createBuilder();
        aihf aihfVarCreateBuilder5 = aiqdVar.createBuilder();
        String string2 = context.getString(R.string.accessibility_list_view_toggle);
        aihfVarCreateBuilder5.copyOnWrite();
        aiqd aiqdVar4 = (aiqd) aihfVarCreateBuilder5.instance;
        string2.getClass();
        aiqdVar4.b |= 2;
        aiqdVar4.c = string2;
        aihfVarCreateBuilder4.copyOnWrite();
        aiqe aiqeVar4 = (aiqe) aihfVarCreateBuilder4.instance;
        aiqd aiqdVar5 = (aiqd) aihfVarCreateBuilder5.build();
        aiqdVar5.getClass();
        aiqeVar4.c = aiqdVar5;
        aiqeVar4.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        ajno ajnoVar6 = (ajno) aihfVarCreateBuilder.instance;
        aiqe aiqeVar5 = (aiqe) aihfVarCreateBuilder4.build();
        aiqeVar5.getClass();
        ajnoVar6.m = aiqeVar5;
        ajnoVar6.b |= 2097152;
        ajwo ajwoVarC2 = c(anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_LIST_ITEMS, ajwoVar);
        aihfVarCreateBuilder.copyOnWrite();
        ajno ajnoVar7 = (ajno) aihfVarCreateBuilder.instance;
        ajwoVarC2.getClass();
        ajnoVar7.j = ajwoVarC2;
        ajnoVar7.b |= 32768;
        aihhVar.e(aihlVar, (ajno) aihfVarCreateBuilder.build());
        return (apji) aihhVar.build();
    }
}
