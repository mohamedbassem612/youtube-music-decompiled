package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class via implements vio {
    private final /* synthetic */ int $cid;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public via(vic vicVar, viz vizVar, Executor executor, vhn vhnVar, xgm xgmVar, int i) {
        this.$cid = i;
        this.a = vicVar;
        this.b = vizVar;
        this.c = executor;
        this.e = vhnVar;
        this.f = xgmVar;
        this.d = new xqg(1);
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, xgm] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, xgm] */
    @Override // defpackage.vio
    public final void jb(final uxi uxiVar) {
        Optional optionalEmpty;
        String str;
        if (this.$cid == 0) {
            augy augyVar = ((uxk) uxiVar).a;
            if (augyVar.c == 105) {
                aihf aihfVarCreateBuilder = vbu.a.createBuilder();
                String str2 = (augyVar.c == 105 ? (augs) augyVar.d : augs.a).c;
                aihfVarCreateBuilder.copyOnWrite();
                vbu vbuVar = (vbu) aihfVarCreateBuilder.instance;
                str2.getClass();
                vbuVar.b |= 1;
                vbuVar.c = str2;
                aihfVarCreateBuilder.copyOnWrite();
                vbu vbuVar2 = (vbu) aihfVarCreateBuilder.instance;
                vbuVar2.b |= 2;
                vbuVar2.d = SemanticState.LiveRegion;
                aihfVarCreateBuilder.copyOnWrite();
                vbu vbuVar3 = (vbu) aihfVarCreateBuilder.instance;
                vbuVar3.b |= 4;
                vbuVar3.e = SemanticState.LiveRegion;
                vbu vbuVar4 = (vbu) aihfVarCreateBuilder.build();
                augs augsVar = augyVar.c == 105 ? (augs) augyVar.d : augs.a;
                if ((augsVar.b & 2) != 0) {
                    auhi auhiVar = augsVar.d;
                    if (auhiVar == null) {
                        auhiVar = auhi.a;
                    }
                    aiie aiieVar = auhiVar.d;
                    optionalEmpty = aiieVar.isEmpty() ? Optional.empty() : Optional.of(Uri.parse((String) aiieVar.get((aiieVar.indexOf(auhiVar.c) + 1) % aiieVar.size())));
                } else {
                    optionalEmpty = Optional.empty();
                }
                Optional optional = optionalEmpty;
                hmo hmoVar = new hmo(this, uxiVar, augyVar, vbuVar4, 12);
                if (optional.isEmpty()) {
                    zvp.a(zvn.b, zvm.y, "VideoFX: Static Sticker added without valid uri");
                    return;
                } else {
                    this.f.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(65452)), null);
                    this.c.execute(afwl.i(new rmx(this, optional, hmoVar, 13, null)));
                    return;
                }
            }
            return;
        }
        augy augyVar2 = ((uxk) uxiVar).a;
        int i = augyVar2.c;
        if (i == 106) {
            if (((i == 106 ? (augv) augyVar2.d : augv.a).b & 4) != 0) {
                auhj auhjVar = (augyVar2.c == 106 ? (augv) augyVar2.d : augv.a).e;
                if (auhjVar == null) {
                    auhjVar = auhj.a;
                }
                if (auhjVar.d.isEmpty()) {
                    return;
                }
                augv augvVar = augyVar2.c == 106 ? (augv) augyVar2.d : augv.a;
                if ((augvVar.b & 4) != 0) {
                    auhj auhjVar2 = augvVar.e;
                    if (auhjVar2 == null) {
                        auhjVar2 = auhj.a;
                    }
                    aiie aiieVar2 = auhjVar2.d;
                    str = aiieVar2.isEmpty() ? augvVar.d : (String) aiieVar2.get((aiieVar2.indexOf(auhjVar2.c) + 1) % aiieVar2.size());
                } else {
                    str = augvVar.d;
                }
                Object obj = this.d;
                TextView textView = (TextView) LayoutInflater.from((Context) obj).inflate(R.layout.unicode_emoji_sticker, (ViewGroup) null);
                textView.setText(str);
                this.c.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(65452)), null);
                auhj auhjVar3 = (augyVar2.c == 106 ? (augv) augyVar2.d : augv.a).e;
                if (auhjVar3 == null) {
                    auhjVar3 = auhj.a;
                }
                aihf builder = auhjVar3.toBuilder();
                builder.copyOnWrite();
                auhj auhjVar4 = (auhj) builder.instance;
                str.getClass();
                auhjVar4.b |= 1;
                auhjVar4.c = str;
                auhj auhjVar5 = (auhj) builder.build();
                jrr jrrVar = (jrr) augyVar2.toBuilder();
                aihf builder2 = (augyVar2.c == 106 ? (augv) augyVar2.d : augv.a).toBuilder();
                builder2.copyOnWrite();
                augv augvVar2 = (augv) builder2.instance;
                auhjVar5.getClass();
                augvVar2.e = auhjVar5;
                augvVar2.b |= 4;
                jrrVar.copyOnWrite();
                augy augyVar3 = (augy) jrrVar.instance;
                augv augvVar3 = (augv) builder2.build();
                augvVar3.getClass();
                augyVar3.d = augvVar3;
                augyVar3.c = 106;
                yno.fJ((Activity) obj, (zf) this.e, textView, jrrVar, new vih() { // from class: vgg
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, viz] */
                    @Override // defpackage.vih
                    public final void a(jrr jrrVar2, vbu vbuVar5) {
                        this.b.f.f(uxiVar, jrrVar2, vbuVar5);
                    }
                });
            }
        }
    }

    public via(Activity activity, viz vizVar, vge vgeVar, zf zfVar, vhn vhnVar, xgm xgmVar, int i) {
        this.$cid = i;
        this.d = activity;
        this.f = vizVar;
        this.a = vgeVar;
        this.e = zfVar;
        this.b = vhnVar;
        this.c = xgmVar;
    }
}
