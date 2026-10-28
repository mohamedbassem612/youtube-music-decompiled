package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uow implements upn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ uow(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.upn
    public final void a(String str, Optional optional) {
        if (this.$cid == 0) {
            ((upg) this.a).h((String) optional.orElse(str));
            return;
        }
        Object obj = this.a;
        uoa uoaVar = (uoa) obj;
        Uri uri = uoaVar.C;
        if (uri != null) {
            vfb vfbVarA = uoaVar.e.a(uri);
            if (vfbVarA == null) {
                zvl zvlVar = uoaVar.g;
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 70;
                zvjVarA.i = 278;
                zvjVarA.d("ImageProjectState null when launching media gen image editor");
                zvlVar.a(zvjVarA.a());
                return;
            }
            Uri uriA = vfbVarA.a(uoaVar.C);
            aihf aihfVarCreateBuilder = upv.a.createBuilder();
            String string = uriA.toString();
            aihfVarCreateBuilder.copyOnWrite();
            upv upvVar = (upv) aihfVarCreateBuilder.instance;
            string.getClass();
            upvVar.b |= 4;
            upvVar.e = string;
            apgr apgrVar = uoaVar.h.h;
            if (apgrVar == null) {
                apgrVar = apgr.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            upv upvVar2 = (upv) aihfVarCreateBuilder.instance;
            apgrVar.getClass();
            upvVar2.k = apgrVar;
            upvVar2.b |= SemanticState.Hidden;
            if (str != null) {
                aihfVarCreateBuilder.copyOnWrite();
                upv upvVar3 = (upv) aihfVarCreateBuilder.instance;
                upvVar3.b |= 16;
                upvVar3.g = str;
            }
            uhe uheVar = new uhe(aihfVarCreateBuilder, 12);
            if (true == optional.isPresent()) {
                Object obj2 = optional.get();
                aihf aihfVar = (aihf) uheVar.a;
                aihfVar.copyOnWrite();
                upv upvVar4 = (upv) aihfVar.instance;
                upvVar4.b |= 32;
                upvVar4.h = (String) obj2;
            }
            affd affdVar = uoaVar.b;
            upv upvVar5 = (upv) aihfVarCreateBuilder.build();
            uoq uoqVar = new uoq();
            auom.f(uoqVar);
            afpu.e(uoqVar, affdVar);
            afpl.b(uoqVar, upvVar5);
            afpu.e(uoqVar, affdVar);
            try {
                uns unsVar = ((uoa) obj).a;
                av avVar = new av(unsVar.getChildFragmentManager());
                avVar.q(R.id.ai_editor_page, uoqVar, "MediaGenImageEditorFragmentPeer");
                avVar.o(null);
                avVar.a(false, true);
                unsVar.getChildFragmentManager().ah();
                unsVar.requireView().findViewById(R.id.ai_editor_page).setVisibility(0);
                unsVar.requireView().findViewById(R.id.image_editor_page).setVisibility(8);
                uoqVar.peer().o = (uoa) obj;
            } catch (IllegalStateException e) {
                zvl zvlVar2 = uoaVar.g;
                zvj zvjVarA2 = zvk.a();
                zvjVarA2.c(ajtv.ERROR_LEVEL_WARNING);
                zvjVarA2.j = 70;
                zvjVarA2.i = 278;
                zvjVarA2.d("Unable to transition to Ai Editor Fragment");
                zvjVarA2.f(e);
                zvlVar2.a(zvjVarA2.a());
            }
        }
    }
}
