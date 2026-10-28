package defpackage;

import android.text.TextUtils;
import android.view.accessibility.CaptioningManager;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acal implements abrf {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/player/subtitles/CaptionPlayerServiceModifier");
    private final ListenableFuture d;
    public volatile String b = "";
    public final Set a = DesugarCollections.synchronizedSet(new HashSet());

    public acal(ListenableFuture listenableFuture) {
        this.d = listenableFuture;
    }

    @Override // defpackage.abrf
    public final void hX(abri abriVar) {
        ListenableFuture listenableFuture = this.d;
        if (listenableFuture.isDone()) {
            try {
                agev agevVar = (agev) ahng.v(listenableFuture);
                if (agevVar.g()) {
                    CaptioningManager captioningManager = (CaptioningManager) agevVar.c();
                    aihf aihfVarCreateBuilder = alvs.a.createBuilder();
                    if (captioningManager.isEnabled()) {
                        aihfVarCreateBuilder.copyOnWrite();
                        alvs alvsVar = (alvs) aihfVarCreateBuilder.instance;
                        alvsVar.b |= 1;
                        alvsVar.c = true;
                    }
                    Locale locale = captioningManager.getLocale();
                    if (locale != null) {
                        String language = locale.getLanguage();
                        aihfVarCreateBuilder.copyOnWrite();
                        alvs alvsVar2 = (alvs) aihfVarCreateBuilder.instance;
                        language.getClass();
                        alvsVar2.b |= 2;
                        alvsVar2.d = language;
                    }
                    Set set = this.a;
                    if (!set.isEmpty()) {
                        aihfVarCreateBuilder.copyOnWrite();
                        alvs alvsVar3 = (alvs) aihfVarCreateBuilder.instance;
                        alvsVar3.a();
                        aifs.addAll(set, alvsVar3.e);
                    } else if (!TextUtils.isEmpty(this.b)) {
                        String str = this.b;
                        aihfVarCreateBuilder.copyOnWrite();
                        alvs alvsVar4 = (alvs) aihfVarCreateBuilder.instance;
                        str.getClass();
                        alvsVar4.a();
                        alvsVar4.e.add(str);
                    }
                    final alvs alvsVar5 = (alvs) aihfVarCreateBuilder.build();
                    abriVar.J = alvsVar5;
                    abriVar.F(new abrh() { // from class: acak
                        @Override // defpackage.abrh
                        public final void a(dov dovVar) {
                            dovVar.H("captionParams", alvsVar5.toByteArray());
                        }
                    });
                }
            } catch (ExecutionException e) {
                ((agrc) ((agrc) ((agrc) c.b()).j(e)).k("com/google/android/libraries/youtube/player/subtitles/CaptionPlayerServiceModifier", "decoratePlayerServiceRequestWrapper", (char) 135, "CaptionPlayerServiceModifier.java")).t("Exception getting CaptioningManager");
            }
        }
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        this.a.clear();
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        this.a.clear();
    }
}
