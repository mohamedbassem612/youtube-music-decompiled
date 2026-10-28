package defpackage;

import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ilc extends ilj {
    public EditText b;
    public RecyclerView c;
    public adwg d;
    public ProgressBar e;
    public LinearLayout f;
    public LinearLayout g;
    public TextView h;
    public iky i;
    public afki j;
    public afqk k;
    public wom l;
    public jax m;
    public jaz n;
    public xgn o;
    public jer p;
    public advn q;
    public avlh r;
    public avmb s;
    public boolean t;
    public vxz u;
    public aeod v;
    public vwt w;
    private Button x;
    private AppCompatImageView y;
    private LinearLayoutManager z;
    public final agrf a = agrf.h("com/google/android/apps/youtube/music/playlistfiltersearch/PlaylistFilterSearchInputFragment");
    private final awmi A = new awmp(new qf(this, 20));
    private final ila B = new ila(this);

    public final iky a() {
        iky ikyVar = this.i;
        if (ikyVar != null) {
            return ikyVar;
        }
        awrc.b("playlistFilterSearchDataService");
        return null;
    }

    public final wom b() {
        wom womVar = this.l;
        if (womVar != null) {
            return womVar;
        }
        awrc.b("browseService");
        return null;
    }

    public final xgn c() {
        xgn xgnVar = this.o;
        if (xgnVar != null) {
            return xgnVar;
        }
        awrc.b("interactionLogger");
        return null;
    }

    public final advn d() {
        advn advnVar = this.q;
        if (advnVar != null) {
            return advnVar;
        }
        awrc.b("loadingStatusAdapter");
        return null;
    }

    public final afki e() {
        afki afkiVar = this.j;
        if (afkiVar != null) {
            return afkiVar;
        }
        awrc.b("futuresMixin");
        return null;
    }

    public final afqk f() {
        afqk afqkVar = this.k;
        if (afqkVar != null) {
            return afqkVar;
        }
        awrc.b("streamMixin");
        return null;
    }

    public final void g() {
        ListenableFuture listenableFutureAg;
        awmi awmiVar = this.A;
        afki afkiVarE = e();
        iky ikyVarA = a();
        String str = (String) awmiVar.a();
        str.getClass();
        if (str.length() == 0) {
            ((agrc) iky.a.b().k("com/google/android/apps/youtube/music/playlistfiltersearch/PlaylistFilterSearchDataService", "fetchPlaylistMetadata", 241, "PlaylistFilterSearchDataService.kt")).t("Playlist id is empty");
            listenableFutureAg = ahng.m(new IllegalArgumentException("Playlist id is empty"));
        } else {
            ikyVarA.f.d(str);
            ikyVarA.i.d(Boolean.FALSE);
            listenableFutureAg = awrc.ag(ikyVarA.d, awov.a, new gmc(ikyVarA, str, (awoq) null, 7));
        }
        afkiVarE.c(ahub.s(listenableFutureAg), this.B);
    }

    public final void h() {
        ProgressBar progressBar = this.e;
        LinearLayout linearLayout = null;
        if (progressBar == null) {
            awrc.b("initialLoadingSpinner");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            awrc.b("suggestionRecyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        LinearLayout linearLayout2 = this.f;
        if (linearLayout2 == null) {
            awrc.b("errorStateContainer");
            linearLayout2 = null;
        }
        linearLayout2.setVisibility(0);
        LinearLayout linearLayout3 = this.g;
        if (linearLayout3 == null) {
            awrc.b("noResultsStateContainer");
        } else {
            linearLayout = linearLayout3;
        }
        linearLayout.setVisibility(8);
    }

    public final void i(String str) {
        iky ikyVarA = a();
        ikyVarA.g.d(str == null ? "" : str);
        ikyVarA.h.d(0);
        AppCompatImageView appCompatImageView = this.y;
        if (appCompatImageView == null) {
            awrc.b("searchClearButton");
            appCompatImageView = null;
        }
        appCompatImageView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
    }

    public final vwt j() {
        vwt vwtVar = this.w;
        if (vwtVar != null) {
            return vwtVar;
        }
        awrc.b("rxLifecycle");
        return null;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        e().b(this.B);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        aeod aeodVar;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.playlist_filter_search_input_fragment, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.search_edit_text);
        viewFindViewById.getClass();
        this.b = (EditText) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.search_toolbar);
        viewFindViewById2.getClass();
        View viewFindViewById3 = viewInflate.findViewById(R.id.suggestion_list);
        viewFindViewById3.getClass();
        this.c = (RecyclerView) viewFindViewById3;
        this.z = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView2 = this.c;
        jer jerVar = null;
        if (recyclerView2 == null) {
            awrc.b("suggestionRecyclerView");
            recyclerView2 = null;
        }
        LinearLayoutManager linearLayoutManager2 = this.z;
        if (linearLayoutManager2 == null) {
            awrc.b("suggestionListLayoutManager");
            linearLayoutManager2 = null;
        }
        recyclerView2.ah(linearLayoutManager2);
        View viewFindViewById4 = viewInflate.findViewById(R.id.cancel_button);
        viewFindViewById4.getClass();
        Button button = (Button) viewFindViewById4;
        this.x = button;
        if (button == null) {
            awrc.b("cancelButton");
            button = null;
        }
        button.setOnClickListener(new hdf(this, 12));
        View viewFindViewById5 = viewInflate.findViewById(R.id.search_clear);
        viewFindViewById5.getClass();
        this.y = (AppCompatImageView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.initial_loading_spinner);
        viewFindViewById6.getClass();
        this.e = (ProgressBar) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.error_state_container);
        viewFindViewById7.getClass();
        this.f = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(R.id.no_results_state_container);
        viewFindViewById8.getClass();
        this.g = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = viewInflate.findViewById(R.id.no_results_title);
        viewFindViewById9.getClass();
        this.h = (TextView) viewFindViewById9;
        jaz jazVar = this.n;
        if (jazVar == null) {
            awrc.b("musicViewPoolSectionControllerFactory");
            jazVar = null;
        }
        jay jayVarA = jazVar.a(b(), c());
        jax jaxVar = this.m;
        if (jaxVar == null) {
            awrc.b("recyclerViewSectionListControllerFactory");
            jaxVar = null;
        }
        RecyclerView recyclerView3 = this.c;
        if (recyclerView3 == null) {
            awrc.b("suggestionRecyclerView");
            recyclerView = null;
        } else {
            recyclerView = recyclerView3;
        }
        LinearLayoutManager linearLayoutManager3 = this.z;
        if (linearLayoutManager3 == null) {
            awrc.b("suggestionListLayoutManager");
            linearLayoutManager = null;
        } else {
            linearLayoutManager = linearLayoutManager3;
        }
        aeod aeodVar2 = this.v;
        if (aeodVar2 == null) {
            awrc.b("sectionListLayoutControllerFactory");
            aeodVar = null;
        } else {
            aeodVar = aeodVar2;
        }
        vwt vwtVarJ = j();
        advn advnVarD = d();
        wom womVarB = b();
        jer jerVar2 = this.p;
        if (jerVar2 == null) {
            awrc.b("musicPresenterViewPoolSupplier");
        } else {
            jerVar = jerVar2;
        }
        jba jbaVar = jerVar.a;
        jbaVar.getClass();
        this.d = jaxVar.a(new jaw(null, recyclerView, linearLayoutManager, advnVarD, null, aeodVar, vwtVarJ, womVarB, jayVarA, jbaVar, c(), null, null, null, null, null, null, 258193));
        return viewInflate;
    }

    @Override // defpackage.cc
    public final void onDestroyView() {
        super.onDestroyView();
        iky ikyVarA = a();
        ikyVarA.e.d(awno.a);
        ikyVarA.f.d("");
        ikyVarA.g.d("");
        ikyVarA.h.d(0);
        ikyVarA.i.d(Boolean.FALSE);
    }

    @Override // defpackage.cc
    public final void onStart() {
        super.onStart();
        g();
    }

    @Override // defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        EditText editText = this.b;
        vxz vxzVar = null;
        if (editText == null) {
            awrc.b("searchEditText");
            editText = null;
        }
        editText.requestFocus();
        EditText editText2 = this.b;
        if (editText2 == null) {
            awrc.b("searchEditText");
            editText2 = null;
        }
        if (editText2.isAttachedToWindow()) {
            new zf(requireActivity().getWindow(), editText2).f();
        }
        aewp.O(f().a(a().l), new awqg() { // from class: ikz
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                hmy hmyVar = (hmy) obj;
                hmyVar.getClass();
                Objects.checkIndex(0, 6);
                boolean z = hmyVar instanceof ilf;
                ilc ilcVar = this.a;
                TextView textView = null;
                LinearLayout linearLayout = null;
                RecyclerView recyclerView = null;
                if (z) {
                    ProgressBar progressBar = ilcVar.e;
                    if (progressBar == null) {
                        awrc.b("initialLoadingSpinner");
                        progressBar = null;
                    }
                    progressBar.setVisibility(0);
                    RecyclerView recyclerView2 = ilcVar.c;
                    if (recyclerView2 == null) {
                        awrc.b("suggestionRecyclerView");
                        recyclerView2 = null;
                    }
                    recyclerView2.setVisibility(8);
                    LinearLayout linearLayout2 = ilcVar.f;
                    if (linearLayout2 == null) {
                        awrc.b("errorStateContainer");
                        linearLayout2 = null;
                    }
                    linearLayout2.setVisibility(8);
                    LinearLayout linearLayout3 = ilcVar.g;
                    if (linearLayout3 == null) {
                        awrc.b("noResultsStateContainer");
                    } else {
                        linearLayout = linearLayout3;
                    }
                    linearLayout.setVisibility(8);
                } else if (!(hmyVar instanceof ilg)) {
                    if (hmyVar instanceof ili) {
                        ili iliVar = (ili) hmyVar;
                        List<apox> list = iliVar.a;
                        boolean z2 = iliVar.b;
                        ProgressBar progressBar2 = ilcVar.e;
                        if (progressBar2 == null) {
                            awrc.b("initialLoadingSpinner");
                            progressBar2 = null;
                        }
                        progressBar2.setVisibility(8);
                        LinearLayout linearLayout4 = ilcVar.f;
                        if (linearLayout4 == null) {
                            awrc.b("errorStateContainer");
                            linearLayout4 = null;
                        }
                        linearLayout4.setVisibility(8);
                        LinearLayout linearLayout5 = ilcVar.g;
                        if (linearLayout5 == null) {
                            awrc.b("noResultsStateContainer");
                            linearLayout5 = null;
                        }
                        linearLayout5.setVisibility(8);
                        RecyclerView recyclerView3 = ilcVar.c;
                        if (recyclerView3 == null) {
                            awrc.b("suggestionRecyclerView");
                            recyclerView3 = null;
                        }
                        recyclerView3.setVisibility(0);
                        adwg adwgVar = ilcVar.d;
                        if (adwgVar == null) {
                            awrc.b("sectionListController");
                            adwgVar = null;
                        }
                        adlq adlqVar = adwgVar.j;
                        adlqVar.getClass();
                        if (z2) {
                            adwg adwgVar2 = ilcVar.d;
                            if (adwgVar2 == null) {
                                awrc.b("sectionListController");
                                adwgVar2 = null;
                            }
                            aihf aihfVarCreateBuilder = apoq.a.createBuilder();
                            aihfVarCreateBuilder.ch(list);
                            adwgVar2.as(new wgd((apoq) aihfVarCreateBuilder.build()));
                            if (!list.isEmpty()) {
                                RecyclerView recyclerView4 = ilcVar.c;
                                if (recyclerView4 == null) {
                                    awrc.b("suggestionRecyclerView");
                                } else {
                                    recyclerView = recyclerView4;
                                }
                                recyclerView.ab(0);
                            }
                        } else {
                            int iG = adlqVar.g() - 1;
                            if (iG >= 0) {
                                List list2 = adlqVar.c;
                                adlo adloVar = iG >= list2.size() ? null : (adlo) list2.get(iG);
                                adloVar.getClass();
                                adkz adkzVar = adloVar.a;
                                if (adkzVar instanceof adlq) {
                                    adlq adlqVar2 = (adlq) adkzVar;
                                    if ((adlqVar2.d(adlqVar2.a() - 1) instanceof ixn) && adlqVar2.a() == 21) {
                                        int iG2 = adlqVar2.g() - 1;
                                        adlqVar2.s(iG2, iG2);
                                    }
                                }
                            }
                            int iG3 = adlqVar.g();
                            for (apox apoxVar : list) {
                                adwg adwgVar3 = ilcVar.d;
                                if (adwgVar3 == null) {
                                    awrc.b("sectionListController");
                                    adwgVar3 = null;
                                }
                                adwgVar3.U(apoxVar, iG3, iG3);
                            }
                        }
                    } else if (hmyVar instanceof ile) {
                        ilcVar.h();
                    } else {
                        if (!(hmyVar instanceof ilh)) {
                            throw new awmj();
                        }
                        String str = ((ilh) hmyVar).a;
                        ProgressBar progressBar3 = ilcVar.e;
                        if (progressBar3 == null) {
                            awrc.b("initialLoadingSpinner");
                            progressBar3 = null;
                        }
                        progressBar3.setVisibility(8);
                        RecyclerView recyclerView5 = ilcVar.c;
                        if (recyclerView5 == null) {
                            awrc.b("suggestionRecyclerView");
                            recyclerView5 = null;
                        }
                        recyclerView5.setVisibility(8);
                        LinearLayout linearLayout6 = ilcVar.f;
                        if (linearLayout6 == null) {
                            awrc.b("errorStateContainer");
                            linearLayout6 = null;
                        }
                        linearLayout6.setVisibility(8);
                        LinearLayout linearLayout7 = ilcVar.g;
                        if (linearLayout7 == null) {
                            awrc.b("noResultsStateContainer");
                            linearLayout7 = null;
                        }
                        linearLayout7.setVisibility(0);
                        TextView textView2 = ilcVar.h;
                        if (textView2 == null) {
                            awrc.b("noResultsTitle");
                        } else {
                            textView = textView2;
                        }
                        textView.setText(ilcVar.getString(R.string.playlist_filter_search_no_results_title, str));
                    }
                }
                return awmy.a;
            }
        });
        aewp.O(f().a(a().k), new hol(this, 11));
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            awrc.b("suggestionRecyclerView");
            recyclerView = null;
        }
        recyclerView.aC(new ilb(this));
        RecyclerView recyclerView2 = this.c;
        if (recyclerView2 == null) {
            awrc.b("suggestionRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.w(new aeed(this, 1));
        AppCompatImageView appCompatImageView = this.y;
        if (appCompatImageView == null) {
            awrc.b("searchClearButton");
            appCompatImageView = null;
        }
        appCompatImageView.setOnClickListener(new hdf(this, 13));
        EditText editText3 = this.b;
        if (editText3 == null) {
            awrc.b("searchEditText");
            editText3 = null;
        }
        editText3.addTextChangedListener(new gxv(this, 2));
        vxz vxzVar2 = this.u;
        if (vxzVar2 == null) {
            awrc.b("musicClientConfig");
        } else {
            vxzVar = vxzVar2;
        }
        if (vxzVar.l(214, 45745585L, false)) {
            j().E(new huo(this, 6));
        }
    }
}
