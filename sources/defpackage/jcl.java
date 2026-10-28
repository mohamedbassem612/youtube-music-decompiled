package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jcl implements adma {
    public final vxe a;
    public Runnable b;
    private final Context c;
    private final tbt d;
    private final Handler e;
    private final LoadingFrameLayout f;
    private final YouTubeTextView g;
    private final admd h;
    private advl i;
    private xgn j;
    private adly k;

    public jcl(Context context, tbt tbtVar, Handler handler, vxe vxeVar) {
        context.getClass();
        this.c = context;
        jdw jdwVar = new jdw(context);
        this.h = jdwVar;
        tbtVar.getClass();
        this.d = tbtVar;
        this.a = vxeVar;
        this.e = handler;
        LoadingFrameLayout loadingFrameLayout = new LoadingFrameLayout(context, R.layout.loading_status_error_view, R.layout.loading_status_progress_view);
        this.f = loadingFrameLayout;
        YouTubeTextView youTubeTextView = (YouTubeTextView) LayoutInflater.from(context).inflate(R.layout.text_link_item, (ViewGroup) null);
        this.g = youTubeTextView;
        loadingFrameLayout.addView(youTubeTextView);
        jdwVar.c(loadingFrameLayout);
    }

    private final void e(adtt adttVar) {
        adly adlyVar;
        int iB = ((adttVar instanceof adtr) && f((adtr) adttVar) && (adlyVar = this.k) != null) ? adlyVar.b("pagePadding", 0) + this.c.getResources().getDimensionPixelSize(R.dimen.item_large_spacing) : 0;
        FrameLayout frameLayout = ((jdw) this.h).a;
        if (frameLayout != null) {
            frameLayout.setPadding(iB, 0, iB, 0);
        }
    }

    private static final boolean f(adtr adtrVar) {
        acjx acjxVar = adtrVar.b;
        return acjxVar != null && acjxVar.a() == acjw.b;
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.h).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.h.d(null);
        this.f.c(null);
        this.i = null;
        this.b = null;
        this.j = null;
        this.d.l(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [acjx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [acjx, java.lang.Object] */
    public final void d(adts adtsVar) {
        e(adtsVar);
        if (this.j != null && this.i != null) {
            agev agevVar = adtsVar.b;
            if (agevVar.g() && agevVar.c().a() == acjw.b) {
                aihf aihfVarCreateBuilder = argn.a.createBuilder();
                byte[] bArrH = agevVar.c().h();
                aigj aigjVar = aigj.d;
                try {
                    aigj aigjVarH = aigj.H(bArrH, 0, bArrH.length);
                    aihfVarCreateBuilder.copyOnWrite();
                    argn argnVar = (argn) aihfVarCreateBuilder.instance;
                    aigjVarH.getClass();
                    argnVar.b |= 1;
                    argnVar.c = aigjVarH;
                    this.j.m(new xgx(this.j.g(Integer.valueOf(System.identityHashCode(this.i)), xhb.b(66790))), new xgx((argn) aihfVarCreateBuilder.build()));
                } catch (aiik e) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                }
            }
        }
        this.f.h(2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        tbt tbtVar;
        Object obj2;
        advl advlVar = (advl) obj;
        this.k = adlyVar;
        this.j = adlyVar.b;
        advl advlVar2 = this.i;
        if (advlVar2 != null) {
            if (advlVar2.b != advlVar.b) {
                tbtVar = this.d;
                tbtVar.l(this);
                obj2 = advlVar.b;
                if (obj2 != null) {
                    tbtVar.h(this, obj2);
                }
            }
        } else {
            tbtVar = this.d;
            tbtVar.l(this);
            obj2 = advlVar.b;
            if (obj2 != null) {
                tbtVar.h(this, obj2);
            }
        }
        this.i = advlVar;
        LoadingFrameLayout loadingFrameLayout = this.f;
        loadingFrameLayout.d(new jck(this, 0));
        loadingFrameLayout.c(advlVar.e);
        admd admdVar = this.h;
        admdVar.d(advlVar.d);
        YouTubeTextView youTubeTextView = this.g;
        CharSequence charSequence = advlVar.c;
        tuk.u(youTubeTextView, null);
        adtt adttVar = advlVar.a;
        if (adttVar instanceof iyb) {
            iyb iybVar = (iyb) adttVar;
            e(iybVar);
            ihq ihqVar = new ihq((Object) this, (Object) iybVar, 2, (byte[]) null);
            if (iybVar.a() > 0) {
                loadingFrameLayout.h(1);
                hqa hqaVar = new hqa(this, ihqVar, 16);
                this.b = hqaVar;
                this.e.postDelayed(hqaVar, iybVar.a());
            } else {
                ihqVar.run();
            }
            FrameLayout frameLayout = ((jdw) admdVar).a;
            if (frameLayout.getLayoutParams() != null) {
                frameLayout.getLayoutParams().height = true != iybVar.c() ? -2 : -1;
            }
        } else if (adttVar instanceof adtk) {
            onContentEvent((adtk) adttVar);
        } else if (adttVar instanceof adts) {
            d((adts) adttVar);
        } else if (adttVar instanceof adtr) {
            onErrorEvent((adtr) adttVar);
        }
        admdVar.e(adlyVar);
    }

    @tcc
    public void onContentEvent(adtk adtkVar) {
        e(adtkVar);
        Runnable runnable = this.b;
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
            this.b = null;
        }
        this.f.h(3);
    }

    @tcc
    public void onErrorEvent(adtr adtrVar) {
        e(adtrVar);
        Runnable runnable = this.b;
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
            this.b = null;
        }
        boolean zF = f(adtrVar);
        FrameLayout frameLayout = ((jdw) this.h).a;
        if (frameLayout != null && frameLayout.getLayoutParams() != null) {
            frameLayout.getLayoutParams().height = true != zF ? -1 : -2;
        }
        this.f.f(adtrVar.a(), true, true, zF);
    }
}
