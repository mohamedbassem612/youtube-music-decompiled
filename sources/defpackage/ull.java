package defpackage;

import android.widget.ImageView;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;
import com.google.android.libraries.youtube.creation.geo.LocationSearchView;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ull implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ull(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                Object obj = this.a;
                ulp ulpVar = (ulp) obj;
                if (ulpVar.k == null) {
                    ulpVar.k = ulpVar.g.a.ag().O(avmh.a()).ag(new sqk(obj, 18), new sqk(obj, 19));
                }
                if (ulpVar.o == null) {
                    zf zfVar = ulpVar.N;
                    ulpVar.o = ((avlr) zfVar.a).ag(new jeh(13), new sqk(obj, 20));
                }
                break;
            case 1:
                this.a.cancel(false);
                break;
            case 2:
                ((ShortsPlayerView) this.a).c.setVisibility(0);
                break;
            case 3:
                upg upgVar = (upg) this.a;
                ImageView imageViewD = upgVar.d();
                imageViewD.getClass();
                imageViewD.setImageURI(upgVar.i);
                upgVar.r();
                upgVar.p(false);
                break;
            case 4:
                ((upg) this.a).p(false);
                break;
            case 5:
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 70;
                zvjVarA.i = 278;
                zvjVarA.d("Invalid State: No edits to save");
                ((upg) this.a).h.a(zvjVarA.a());
                break;
            case 6:
                ((upc) this.a).f.p(false);
                break;
            case 7:
                File file = (File) this.a;
                if (file.exists() && !file.delete()) {
                    twu.d("MediaGenImageEditorFragmentPeer", 6, "Unable to delete the file: ".concat(String.valueOf(file.getAbsolutePath())), null);
                    break;
                }
                break;
            case 8:
                Iterator it = ((xte) this.a).f.iterator();
                while (it.hasNext()) {
                    ((uqe) it.next()).c();
                }
                break;
            case 9:
                Iterator it2 = ((xte) this.a).f.iterator();
                while (it2.hasNext()) {
                    ((uqe) it2.next()).b();
                }
                break;
            case 10:
                avmn avmnVar = (avmn) ((AtomicReference) this.a).get();
                if (avmnVar != null) {
                    avmnVar.dispose();
                }
                break;
            case 11:
                ((vor) this.a).A();
                break;
            case 12:
                ((uzm) this.a).c.q();
                break;
            case 13:
                xpl xplVar = ((vae) this.a).m;
                if (xplVar != null) {
                    xplVar.q();
                }
                break;
            case 14:
                ((vak) this.a).f.q();
                break;
            case 15:
                tuk.m(((LocationSearchView) this.a).a);
                break;
            case 16:
                ((vea) this.a).e();
                break;
            case 17:
                ((vge) this.a).c();
                break;
            case 18:
                ((vgc) this.a).b.c();
                break;
            case 19:
                vgj vgjVar = (vgj) ((vgi) this.a).a;
                vgjVar.v.C(vgjVar.w);
                break;
            default:
                vgp vgpVar = ((vgo) this.a).c;
                vgpVar.v.C(vgpVar.w);
                break;
        }
    }
}
