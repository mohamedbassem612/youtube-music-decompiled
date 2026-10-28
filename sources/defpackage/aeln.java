package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import app.rive.semantics.SemanticState;
import java.io.File;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeln implements vxc {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/share/endpoint/ShareStoriesCommand");
    private final Context b;
    private final ahtv c;
    private final axlj d;
    private final aciz e;

    public aeln(Context context, axlj axljVar, ahtv ahtvVar, aciz acizVar) {
        context.getClass();
        this.b = context;
        this.d = axljVar;
        this.c = ahtvVar;
        this.e = acizVar;
    }

    private static final Bitmap d(aigj aigjVar) {
        return BitmapFactory.decodeByteArray(aigjVar.G(), 0, aigjVar.d());
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqdn.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aqdn aqdnVar = (aqdn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        Bitmap bitmapDecodeFile = null;
        if ((aqdnVar.c & SemanticState.Focused) != 0) {
            try {
                File file = new File(new File(this.b.getCacheDir(), "image_share"), aqdnVar.l);
                if (file.exists()) {
                    bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                }
            } catch (IllegalArgumentException e) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/share/endpoint/ShareStoriesCommand", "getBitmapWithStickerImageFileName", (char) 167, "ShareStoriesCommand.java")).t("Failed to get URI for lyrics share image.");
            }
            if (bitmapDecodeFile == null) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/share/endpoint/ShareStoriesCommand", "resolve", 59, "ShareStoriesCommand.java")).t("Failed to get Bitmap from Sticker Image File Name.");
                return;
            }
        }
        Bitmap bitmap = bitmapDecodeFile;
        try {
            int iBc = a.bc(aqdnVar.g);
            if (iBc == 0) {
                iBc = 1;
            }
            int i = iBc - 1;
            if (i == 1) {
                int i2 = aqdnVar.c & SemanticState.Focused;
                axlj axljVar = this.d;
                if (i2 == 0) {
                    axljVar.g(aqdnVar.h, aqdnVar.i, d(aqdnVar.f), aqdnVar.j, aqdnVar.k);
                    return;
                }
                String str = aqdnVar.h;
                String str2 = aqdnVar.i;
                bitmap.getClass();
                axljVar.g(str, str2, bitmap, aqdnVar.j, aqdnVar.k);
                return;
            }
            if (i == 2) {
                int i3 = aqdnVar.c;
                if ((i3 & 1) != 0) {
                    this.d.h(aqdnVar.h, aqdnVar.i, d(aqdnVar.d == 2 ? (aigj) aqdnVar.e : aigj.d), d(aqdnVar.f), aqdnVar.j, aqdnVar.k);
                    return;
                }
                int i4 = i3 & SemanticState.Focused;
                axlj axljVar2 = this.d;
                if (i4 != 0) {
                    String str3 = aqdnVar.h;
                    String str4 = aqdnVar.i;
                    Bitmap bitmapD = d(aqdnVar.d == 2 ? (aigj) aqdnVar.e : aigj.d);
                    bitmap.getClass();
                    axljVar2.h(str3, str4, bitmapD, bitmap, aqdnVar.j, aqdnVar.k);
                    return;
                }
                String str5 = aqdnVar.h;
                String str6 = aqdnVar.i;
                Bitmap bitmapD2 = d(aqdnVar.d == 2 ? (aigj) aqdnVar.e : aigj.d);
                Intent intentJ = axlj.j(str6, "snapchat://creativekit/preview/1", str5);
                axljVar2.f(intentJ, bitmapD2);
                axljVar2.i(intentJ, "YTM_SHARE_TO_SNAPCHAT_PREVIEW");
                return;
            }
            if (i == 3) {
                int i5 = aqdnVar.c;
                if ((i5 & 1) != 0) {
                    this.c.g(aqdnVar.h, aqdnVar.i, d(aqdnVar.d == 2 ? (aigj) aqdnVar.e : aigj.d), d(aqdnVar.f));
                    return;
                }
                int i6 = i5 & SemanticState.Focused;
                ahtv ahtvVar = this.c;
                if (i6 == 0) {
                    ahtvVar.h(ahtvVar.f(aqdnVar.h, aqdnVar.i, d(aqdnVar.d == 2 ? (aigj) aqdnVar.e : aigj.d)));
                    return;
                }
                String str7 = aqdnVar.h;
                String str8 = aqdnVar.i;
                Bitmap bitmapD3 = d(aqdnVar.d == 2 ? (aigj) aqdnVar.e : aigj.d);
                bitmap.getClass();
                ahtvVar.g(str7, str8, bitmapD3, bitmap);
                return;
            }
            if (i != 4) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/share/endpoint/ShareStoriesCommand", "resolve", 148, "ShareStoriesCommand.java")).t("Unknown story share target.");
                return;
            }
            int i7 = aqdnVar.c;
            if ((i7 & 1) != 0) {
                this.e.u(aqdnVar.h, aqdnVar.i, d(aqdnVar.d == 2 ? (aigj) aqdnVar.e : aigj.d), d(aqdnVar.f));
                return;
            }
            int i8 = i7 & SemanticState.Focused;
            aciz acizVar = this.e;
            if (i8 == 0) {
                acizVar.v(acizVar.t(aqdnVar.h, aqdnVar.i, d(aqdnVar.d == 2 ? (aigj) aqdnVar.e : aigj.d)));
                return;
            }
            String str9 = aqdnVar.h;
            String str10 = aqdnVar.i;
            Bitmap bitmapD4 = d(aqdnVar.d == 2 ? (aigj) aqdnVar.e : aigj.d);
            bitmap.getClass();
            acizVar.u(str9, str10, bitmapD4, bitmap);
        } catch (Exception e2) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e2)).k("com/google/android/libraries/youtube/share/endpoint/ShareStoriesCommand", "resolve", (char) 151, "ShareStoriesCommand.java")).t("Unable to create share intent.");
        }
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
