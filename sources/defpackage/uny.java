package defpackage;

import android.net.Uri;
import android.widget.Toast;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uny implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ uny(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v63, types: [avne, java.lang.Object] */
    @Override // defpackage.twi
    public final void a(Object obj) {
        int i = 1;
        switch (this.$cid) {
            case 0:
                Throwable th = (Throwable) obj;
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 70;
                zvjVarA.i = 278;
                zvjVarA.d("Error restoring project states from editor snapshots");
                if (th != null) {
                    zvjVarA.f(th);
                }
                Object obj2 = this.a;
                zvk zvkVarA = zvjVarA.a();
                uoa uoaVar = (uoa) ((qcb) obj2).a;
                uoaVar.g.a(zvkVarA);
                unz unzVar = uoaVar.A;
                if (unzVar != null) {
                    ((vea) unzVar).f();
                }
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                zvj zvjVarA2 = zvk.a();
                zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA2.j = 70;
                zvjVarA2.i = 278;
                zvjVarA2.d("Error saving edits");
                if (th2 != null) {
                    zvjVarA2.f(th2);
                }
                uoa uoaVar2 = (uoa) this.a;
                uoaVar2.g.a(zvjVarA2.a());
                uoaVar2.t = false;
                break;
            case 2:
                unz unzVar2 = ((uoa) ((qcb) this.a).a).A;
                if (unzVar2 != null) {
                    ((vea) unzVar2).f();
                }
                break;
            case 3:
                afxw.y(new upe((Throwable) obj), ((upg) this.a).a);
                break;
            case 4:
                afxw.y(new upe(null), ((upg) this.a).a);
                break;
            case 5:
                upy upyVar = (upy) obj;
                if (upyVar != null && upyVar.c) {
                    ((upo) this.a).i.set(true);
                    break;
                }
                break;
            case 6:
                Throwable th3 = (Throwable) obj;
                String message = th3 != null ? th3.getMessage() : "";
                Object obj3 = this.a;
                zvp.a(zvn.a, zvm.M, "[ShortsCreation][Android][Effect] Failed to restore xeno effects state from data store, error = ".concat(String.valueOf(message)));
                uxj uxjVar = (uxj) obj3;
                uxjVar.a();
                uxjVar.c();
                break;
            case 7:
                uzf uzfVar = (uzf) obj;
                if (uzfVar != null) {
                    Object obj4 = this.a;
                    apji apjiVar = uzfVar.d;
                    uxj uxjVar2 = (uxj) obj4;
                    uxjVar2.e(uzfVar.a, uzfVar.c, uzfVar.b, apjiVar);
                }
                break;
            case 8:
                Throwable exc = (Throwable) obj;
                if (exc == null) {
                    exc = new Exception("Error retrieving Xeno assets");
                }
                ((uzm) this.a).f(exc);
                break;
            case 9:
                Throwable exc2 = (Throwable) obj;
                if (exc2 == null) {
                    exc2 = new Exception("Error retrieving Xeno assets");
                }
                ((vak) this.a).l(exc2);
                break;
            case 10:
                vea veaVar = (vea) this.a;
                veaVar.l = false;
                veaVar.g(false);
                ((agrc) ((agrc) ((agrc) vea.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/creation/playlist/CustomThumbnailCreationFragmentPeer", "onPlaylistSaveError", (char) 576, "CustomThumbnailCreationFragmentPeer.java")).t("CustomThumbnailCreationFragmentPeer: Failed to modify Playlist with ACTION_SET_CUSTOM_THUMBNAIL action");
                veaVar.h();
                break;
            case 11:
                vea veaVar2 = (vea) this.a;
                veaVar2.f();
                veaVar2.l = false;
                break;
            case 12:
                vkl vklVar = (vkl) this.a;
                if (nuo.h(vklVar.b)) {
                    vklVar.z.setVisibility(0);
                }
                break;
            case 13:
                Optional optional = (Optional) obj;
                optional.getClass();
                vrl vrlVar = new vrl(this.a, i);
                if (true == optional.isPresent()) {
                    Object obj5 = optional.get();
                    Object obj6 = vrlVar.a;
                    xpl xplVar = (xpl) obj5;
                    ((vqs) obj6).i.B((vsv) xplVar.b, (adxd) xplVar.a);
                }
                break;
            case 14:
                Uri.Builder builder = (Uri.Builder) obj;
                if (builder != null) {
                    wlt wltVar = ((wls) this.a).a;
                    if (wltVar.a()) {
                        wltVar.b.a(builder);
                    }
                }
                break;
            case 15:
                ((xdb) this.a).b();
                break;
            case 16:
                Toast.makeText(((xpw) this.a).a.getActivity(), R.string.mdx_pref_delete_tv_codes_remove_error, 1).show();
                break;
            case 17:
                xpw xpwVar = (xpw) this.a;
                xpwVar.a();
                if (xpwVar.c.a() == 0) {
                    cf activity = xpwVar.a.getActivity();
                    if (activity instanceof PairWithTvActivity) {
                        yno.di((PairWithTvActivity) activity, PairWithTvActivity.class, 0, null);
                    }
                }
                break;
            case 18:
                String str = (String) obj;
                try {
                    if (str == null) {
                        zhq zhqVar = zhq.ABR;
                    } else {
                        boolean zEquals = str.equals("5g");
                        ?? r8 = this.a;
                        if (!zEquals) {
                            r8.a("connt", str);
                        } else {
                            r8.a("cat", "5g");
                        }
                    }
                } catch (Exception unused) {
                    zhq zhqVar2 = zhq.ABR;
                    return;
                }
                break;
            case 19:
                ((yyu) this.a).a.Z.w("mqs", String.valueOf((Integer) obj));
                break;
            default:
                Throwable th4 = (Throwable) obj;
                ((agrc) ((agrc) ((agrc) aaac.a.b()).j(th4)).k("com/google/android/libraries/youtube/notification/commands/NotificationOptOutCommand", "onOptOut", 'h', "NotificationOptOutCommand.java")).t("Error rating");
                ((aaac) this.a).c.e(th4);
                break;
        }
    }
}
