package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xki {
    private static final String[] j = {"app_l", "shell_OnCreate", "uiwwa_c", "uiwwa_s", "uiwwa_r", "critical", "intentCritical", "nonCritical", "th0", "brn", "ebrn", "brp", "br", "uiwwa_pr", "uibf_c", "uibf_r", "f_home", "ol", "app_inject", "shell_inject", "f_unknown", "f_home_c", "aa", "br_e", "thmon_e", "uiwwa_lco_c", "uiwwa_i_c", "uiwwa_lc_c", "uiwwa_lc_s", "uiwwa_lc_r", "uiwwa_ir_r", "uiwwa_ir_th0", "total_start_time", "startup_complete", "th0_sc", "th0_cc", "th0_sr", "wm_defer_flush", "des_dispatch0_s", "shell_OnDestroy", "entry_point", "f_process", "f_search", "f_watch", "ida_token", "f_shortcut_search", "f_shortcut_short", "th0_nr", "th0_nc", "th0_ne", "sa", "sas_i", "sa_fo", "app_static_init", "wm_config", "psmd", "shell_bc", "uiwwa_bc", "uiwwa_p", "uiwwa_d", "uiwwa_stop", "uiwwa_inject", "reels_playback", "cpt", "reels_request_sent", "reels_response_received", "reels_view_transition_complete", "reels_edu_dismissed", "reels_age_gating_interstitial_shown", "reels_warning_interstitial_primary_button_clicked", "th0_h", "pb0_s", "octk", "octp", "gu", "abc", "proc_k_l", "cfg_a", "cfg_c", "cfg_h", "ads_signal", "er_s", "er_s_ps", "er_s_pe", "er_t", "er_s_ns", "er_s_nr", "er_s_ne", "er_s_cl", "sdl_s", "sdl_e", "sdl_t", "sdl_er", "griw_ns", "griw_nr", "griw_ne", "ar", "uiwwa_pc", "hi_s", "ri_s", "ri_r", "ri_e", "gu_c_s", "gu_c_r", "hb_fg", "cfg_cs", "opfc", "er_nots", "ss_dp", "ss_r2s", "ss_st", "ss_h", "ss_sf_s", "ss_sf_w", "ss_ofs", "ss_ofe", "ss_b", "ss_pe", "s_to", "npd_cache_old", "npd_cache_miss", "as_q", "as_r", "sdl_nl", "ss_r2s_m_c", "ss_r2s_m_e", "ss_st_m_c", "ss_st_m_e", tau.NOTIFICATION_START_REELS.du, tau.NOTIFICATION_START_WATCH.du, "ss_d_s", "ss_d_r2s", "ss_d_st", "ss_d_u", "ss_d_g_s", "ss_d_g_r2s", "ss_d_g_st", "ss_d_g_u", "er_h_ps", "er_h_pe", "er_f_t", "er_h_ns", "er_h_cl", "ss_dp_1", "ss_dp_1s", "ss_dp_1s_p", "ss_dp_1s_u", "ss_dp_1s_e", "ss_dp_1s_h", "ss_dp_1s_ah", "ss_dp_1s_as", "ss_dp_1s_r2s", "ss_dp_1s_st", "ss_dp_1s_other", "ss_dp_1h", "ss_dp_2", "ss_dp_2_h", "ss_dp_2_u", "cc_w", "cc_w_fc", "cc_w_fe", "cc_r", "cc_r_fe", tau.NOTIFICATION_CREATION_TIME.du, "bsf_cache_r", "bsf_con_r", "bsf_con_n", "bsf_con_i", "bsf_clear_r", "sdl_d", "ss_no_sf", "ss_r2s_sl", "ss_st_sl", "ss_r2s_ee", "ss_r2s_ii", "ss_r2s_ie", "ss_r2s_ei", "ss_tc_log", "ss_tc_log_df", "ss_dp_1s_rco", "et_s", "et_h", "et_r", "et_w", "ft_s", "ft_h", "ft_r", "ft_w", "ft_ir", "ft_dp", "rf_c", "rf_s", "rf_r", "rf_p", "rf_stop", "rf_d", "rf_oss", "rf_ossnc", "rf_ocd", "rf_ocdnc", "s_gc", "er_h_nr", "er_h_ne", "aar", "ss_d_m", "ss_d_nm", "aarva", "aaria", "anaa", "ss_p_seq", "ss_p_seq_r", "ss_p_seq_e", "aaf", "aaf_rf", "ar_ati", "pbi", "pbs", "ss_dp_1s_rce", "ss_sf_ch", "ss_sf_cpe", "on_cc_c", "rf_orp", "rf_orpnc", "acfg_r_s", "acfg_r_e", "acfg_h_r", "th0_ps", "th0_pr", "th0_pe", "br_m_h", "br_m_e", "br_m_m", "br_m_i", "br_m_o", "uiwwa_fdp", "r_wns", "r_wnr", "ss_sfc_pw", "s_er_c_h", "s_er_c_m", "griw_nsk", "sas_rive", "saf_rive", "o_c_h", "o_c_m_cpn", "o_c_m_tmo", "o_c_m_key", "p_atp_s", "p_atp_e", "ads_id", "ss_sf_ch_e", "uiwwa_wfc", "uiwwa_fod", "br_d_s", "br_d_h", "br_d_m", "br_d_e", "br_d_w", "br_d_m_id", "br_d_m_bytes", "br_d_m_parse", "br_d_m_disabled", "br_d_rl_s", "br_d_rl_om", "br_d_rl_h", "br_d_rl_err", "brn_q", "brn_fb", "brn_e", "bre_e", "br_d_m_bss", "br_d_i", "br_d_aw_s", "br_d_aw_to"};
    public final Context a;
    public final xit b;
    public final tre c;
    public final tqj d;
    public final awmd e;
    public final awmd f;
    public final vxz g;
    public final aesp h;
    public final aerj i;

    public xki(Context context, xit xitVar, aerj aerjVar, tre treVar, awmd awmdVar, Optional optional, vxz vxzVar, aesp aespVar, tqj tqjVar, awmd awmdVar2) {
        this.a = context;
        this.b = xitVar;
        this.i = aerjVar;
        this.c = treVar;
        this.d = tqjVar;
        this.e = awmdVar;
        optional.isPresent();
        agke agkeVar = agpi.a;
        this.g = vxzVar;
        this.h = aespVar;
        this.f = awmdVar2;
    }

    public static void d(trh trhVar, abh abhVar, int i, ageb agebVar, Map map, agow agowVar) {
        int i2 = abhVar.a;
        trhVar.d = i2;
        abhVar.a = i2 + 1;
        trhVar.f = i;
        new HashSet();
        for (trh trhVar2 : trhVar.d()) {
            if (trhVar2.j != 128) {
                d(trhVar2, abhVar, i + 1, agebVar, map, agowVar);
            }
        }
        int i3 = abhVar.a;
        trhVar.e = i3;
        abhVar.a = i3 + 1;
    }

    public final amix a(String str, trh trhVar, long j2) {
        trg trgVarA;
        Throwable th = trhVar.k;
        String strB = b(trhVar);
        if (th != null) {
            zvp.b(zvn.b, zvm.s, String.format("SS %s %s", str, strB), th);
        }
        trg trgVarA2 = trhVar.a();
        long j3 = 0;
        if (trgVarA2 != null) {
            long j4 = trgVarA2.a - trhVar.a;
            j3 = j4 == 0 ? 1L : j4;
        }
        if (trhVar.i != 32) {
            for (trh trhVar2 : trhVar.d()) {
                if (trhVar2.j == 256 && trhVar2.k == null && (trgVarA = trhVar2.a()) != null) {
                    j3 += trgVarA.a - trhVar2.a;
                }
            }
        }
        aihf aihfVarCreateBuilder = amji.a.createBuilder();
        long j5 = trhVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        amji amjiVar = (amji) aihfVarCreateBuilder.instance;
        amjiVar.b |= 16;
        amjiVar.e = j5;
        int i = (int) trhVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        amji amjiVar2 = (amji) aihfVarCreateBuilder.instance;
        amjiVar2.b |= 16384;
        amjiVar2.k = i;
        amji amjiVar3 = (amji) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = amix.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amix amixVar = (amix) aihfVarCreateBuilder2.instance;
        str.getClass();
        amixVar.b |= 1;
        amixVar.c = str;
        long j6 = trhVar.a + j2;
        aihfVarCreateBuilder2.copyOnWrite();
        amix amixVar2 = (amix) aihfVarCreateBuilder2.instance;
        amixVar2.b |= 16;
        amixVar2.f = j6;
        aihfVarCreateBuilder2.copyOnWrite();
        amix amixVar3 = (amix) aihfVarCreateBuilder2.instance;
        amixVar3.b |= 8;
        amixVar3.e = j3;
        aihfVarCreateBuilder2.copyOnWrite();
        amix amixVar4 = (amix) aihfVarCreateBuilder2.instance;
        amjiVar3.getClass();
        amixVar4.g = amjiVar3;
        amixVar4.b |= 32;
        if (th != null) {
            aihfVarCreateBuilder2.copyOnWrite();
            amix amixVar5 = (amix) aihfVarCreateBuilder2.instance;
            amixVar5.j = 1;
            amixVar5.b |= SemanticState.Obscured;
            zvp.b(zvn.b, zvm.s, String.format(Locale.US, "SS task %d error %s %s", Integer.valueOf(trhVar.j), str, strB), th);
        }
        return (amix) aihfVarCreateBuilder2.build();
    }

    public final String b(trh trhVar) {
        int i = trhVar.i;
        return i >= 0 ? j[i] : trhVar.c();
    }

    public final void c(trh trhVar, xkf xkfVar, long j2) {
        String strB;
        int i = tqr.a;
        if (this.d.k(1073830113)) {
            int i2 = trhVar.i;
            ThreadLocal threadLocal = trj.a;
            if ((i2 == 229 || i2 == 230 || i2 == 231 || i2 == 232 || i2 == 233) && (strB = b(trhVar)) != null && !strB.isEmpty()) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j3 = trhVar.a + j2;
                TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                xkfVar.f(strB, j3 / 1000);
            }
        }
        int i3 = trhVar.j;
        if (i3 == 32 || i3 == 16 || i3 == 64) {
            xkfVar.d(a(b(trhVar), trhVar, j2));
        }
        Iterator it = trhVar.d().iterator();
        while (it.hasNext()) {
            c((trh) it.next(), xkfVar, j2);
        }
    }
}
