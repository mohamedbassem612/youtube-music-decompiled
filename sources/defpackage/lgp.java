package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lgp extends lfo {
    public static final String[] a = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] b = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] c = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] d = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;", "last_session_checkpoint_timestamp", "ALTER TABLE apps ADD COLUMN last_session_checkpoint_timestamp INTEGER;", "is_app_in_background", "ALTER TABLE apps ADD COLUMN is_app_in_background INTEGER;", "session_timeout_millis", "ALTER TABLE apps ADD COLUMN session_timeout_millis INTEGER;"};
    public static final String[] e = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    public static final String[] f = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;", "events_count", "ALTER TABLE queue ADD COLUMN events_count INTEGER;"};
    public static final String[] g = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] h = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] i = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] j = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] k = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public static final String[] m = {"sum", "ALTER TABLE diagnostic_signals ADD COLUMN sum INTEGER;"};
    public final lfj n;
    private final lgo o;

    public lgp(lfv lfvVar) {
        super(lfvVar);
        this.n = new lfj();
        this.o = new lgo(this, aS());
    }

    static final void al(ContentValues contentValues, Object obj) {
        kro.i("value");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    private final void as(String str, String str2) {
        kro.i(str2);
        o();
        w();
        try {
            e().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e2) {
            aT().c.c("Error deleting snapshot. appId", lcz.a(str2), e2);
        }
    }

    private static final String at(List list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    private static final String au() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(lho.GOOGLE_SIGNAL.g);
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Long l = (Long) lcl.ad.b(null);
        l.longValue();
        return "(" + String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, l) + " OR " + String.format(Locale.US, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, Long.valueOf(lbt.x())) + ')';
    }

    public final List A(String str, String[] strArr) {
        lgp lgpVar;
        o();
        w();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = e().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            aT().c.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        lgpVar = this;
                        try {
                            Object objP = lgpVar.p(cursorQuery, 3);
                            boolean z = cursorQuery.getInt(4) != 0;
                            String string4 = cursorQuery.getString(5);
                            long j2 = cursorQuery.getLong(6);
                            lcd lcdVar = (lcd) lgpVar.u().i(cursorQuery.getBlob(7), lcd.CREATOR);
                            arrayList.add(new lbq(string, string2, new lfy(string3, cursorQuery.getLong(10), objP, string2), cursorQuery.getLong(8), z, string4, lcdVar, j2, (lcd) lgpVar.u().i(cursorQuery.getBlob(9), lcd.CREATOR), cursorQuery.getLong(11), (lcd) lgpVar.u().i(cursorQuery.getBlob(12), lcd.CREATOR)));
                        } catch (SQLiteException e2) {
                            e = e2;
                            lgpVar.aT().c.b("Error querying conditional user property value", e);
                            arrayList = Collections.EMPTY_LIST;
                        }
                    } while (cursorQuery.moveToNext());
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            lgpVar = this;
        }
        return arrayList;
    }

    public final List B(String str) {
        String str2;
        kro.i(str);
        o();
        w();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = e().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j2 = cursorQuery.getLong(2);
                        Object objP = p(cursorQuery, 3);
                        if (objP == null) {
                            aT().c.b("Read invalid user property value, ignoring it. appId", lcz.a(str));
                            str2 = str;
                        } else {
                            str2 = str;
                            arrayList.add(new aaqp(str2, str3, string, j2, objP));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        } catch (SQLiteException e2) {
                            e = e2;
                            aT().c.c("Error querying user properties. appId", lcz.a(str2), e);
                            arrayList = Collections.EMPTY_LIST;
                        }
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                str2 = str;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ff A[DONT_GENERATE] */
    public final List D(String str, String str2, String str3) {
        lgp lgpVar;
        String str4;
        kro.i(str);
        o();
        w();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                String str5 = str;
                arrayList2.add(str5);
                StringBuilder sb = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb.append(" and origin=?");
                    } catch (SQLiteException e2) {
                        e = e2;
                        lgpVar = this;
                        lgpVar.aT().c.d("(2)Error querying user properties", lcz.a(str), str4, e);
                        arrayList = Collections.EMPTY_LIST;
                        return arrayList;
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    arrayList2.add(str3 + '*');
                    sb.append(" and name glob ?");
                }
                cursorQuery = e().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb.toString(), (String[]) arrayList2.toArray(new String[arrayList2.size()]), null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        if (arrayList.size() >= 1000) {
                            aT().c.b("Read more than the max allowed user properties, ignoring excess", 1000);
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        long j2 = cursorQuery.getLong(1);
                        lgpVar = this;
                        try {
                            Object objP = lgpVar.p(cursorQuery, 2);
                            String string2 = cursorQuery.getString(3);
                            if (objP == null) {
                                try {
                                    lgpVar.aT().c.d("(2)Read invalid user property value, ignoring it", lcz.a(str5), string2, str3);
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    str4 = string2;
                                    lgpVar.aT().c.d("(2)Error querying user properties", lcz.a(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                }
                            } else {
                                arrayList.add(new aaqp(str5, string2, string, j2, objP));
                            }
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str5 = str;
                            str4 = string2;
                        } catch (SQLiteException e4) {
                            e = e4;
                        }
                    }
                }
            } catch (SQLiteException e5) {
                e = e5;
                lgpVar = this;
                str4 = str2;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public final void E(String str, Long l, String str2, Bundle bundle) {
        Bundle bundle2;
        lbz lbzVar;
        long j2;
        String str3;
        ContentValues contentValues;
        lir lirVar;
        lgp lgpVar = this;
        String str4 = str;
        kro.l(bundle);
        lgpVar.o();
        lgpVar.w();
        lgn lgnVar = l != null ? new lgn(lgpVar, str4, l.longValue()) : new lgn(lgpVar, str4);
        List<lgm> listA = lgnVar.a();
        while (!listA.isEmpty()) {
            for (lgm lgmVar : listA) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        lirVar = null;
                        lirVar = null;
                        lir lirVar2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = lgpVar.e().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(lgmVar.b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                lirVar = (lir) ((aihf) lfx.l(lir.a.createBuilder(), cursorQuery.getBlob(0))).build();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        lgpVar.aT().f.b("Get multiple raw event metadata records, expected one. appId", lcz.a(str4));
                                                    }
                                                    cursorQuery.close();
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                } catch (SQLiteException e2) {
                                                    e = e2;
                                                    cursor2 = cursorQuery;
                                                    lgpVar.aT().c.c("Data loss. Error selecting raw event. appId", lcz.a(str4), e);
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                }
                                                lirVar2 = lirVar;
                                            } catch (IOException e3) {
                                                lgpVar.aT().c.c("Data loss. Failed to merge raw event metadata. appId", lcz.a(str4), e3);
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                            }
                                        } else {
                                            lgpVar.aT().c.b("Raw event metadata record is missing. appId", lcz.a(str4));
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        lirVar = null;
                                    }
                                    if (lirVar2 != null) {
                                        Iterator it = lirVar2.f.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((lix) it.next()).d.equals(str2)) {
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = cursorQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e5) {
                                e = e5;
                                lirVar = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    long jUpdate = e().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
                    if (jUpdate != 1) {
                        aT().c.c("Failed to update raw event. appId, updatedRows", lcz.a(str3), Long.valueOf(jUpdate));
                    }
                } catch (SQLiteException e6) {
                    aT().c.c("Error updating raw event. appId", lcz.a(lbzVar.a), e6);
                }
                lfx lfxVarU = lgpVar.u();
                lin linVar = lgmVar.d;
                Bundle bundle3 = new Bundle();
                for (lip lipVar : linVar.c) {
                    int i2 = lipVar.b;
                    if ((i2 & 16) != 0) {
                        bundle3.putDouble(lipVar.c, lipVar.g);
                    } else if ((i2 & 8) != 0) {
                        bundle3.putFloat(lipVar.c, lipVar.f);
                    } else if ((i2 & 4) != 0) {
                        bundle3.putLong(lipVar.c, lipVar.e);
                    } else if ((i2 & 2) != 0) {
                        bundle3.putString(lipVar.c, lipVar.d);
                    } else if (lipVar.h.isEmpty()) {
                        lfxVarU.aT().c.b("Unexpected parameter type for parameter", lipVar);
                    } else {
                        bundle3.putParcelableArray(lipVar.c, lfx.O(lipVar.h));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String str5 = string;
                String str6 = linVar.d;
                if (str5 == null) {
                    str5 = "";
                }
                lda ldaVar = new lda(str6, str5, bundle3, linVar.e, linVar.j);
                lga lgaVarL = lgpVar.L();
                Bundle bundle4 = ldaVar.e;
                if (ldaVar.a.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str7 : bundle.keySet()) {
                        if (str7.startsWith("gad_")) {
                            bundle2.remove(str7);
                        }
                    }
                } else {
                    bundle2 = bundle;
                }
                lgaVarL.O(bundle4, bundle2);
                lbzVar = new lbz(lgpVar.t, ldaVar.b, str4, linVar.d, linVar.e, linVar.j, linVar.f, bundle4);
                j2 = lgmVar.a;
                long j3 = lgmVar.b;
                boolean z = lgmVar.c;
                o();
                w();
                str3 = lbzVar.a;
                kro.i(str3);
                byte[] byteArray = u().k(lbzVar).toByteArray();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", lbzVar.b);
                contentValues.put("timestamp", Long.valueOf(lbzVar.d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j3));
                contentValues.put("data", byteArray);
                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(lbzVar.e));
                lgpVar = this;
                str4 = str;
            }
            listA = lgnVar.a();
            lgpVar = this;
            str4 = str;
        }
    }

    public final void F() {
        w();
        e().beginTransaction();
    }

    public final void N(String str) {
        lca lcaVarJ;
        as("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = e().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (lcaVarJ = j("events", str, string)) != null) {
                            aa("events_snapshot", lcaVarJ);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e2) {
                aT().c.c("Error creating snapshot. appId", lcz.a(str), e2);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final void O(long j2) {
        o();
        w();
        try {
            if (e().delete("queue", "rowid=?", new String[]{String.valueOf(j2)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e2) {
            aT().c.b("Failed to delete a bundle in a queue table", e2);
            throw e2;
        }
    }

    public final void P(List list) {
        kro.l(list);
        o();
        w();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 != 0) {
                sb.append(',');
            }
            sb.append(((Long) list.get(i2)).longValue());
        }
        sb.append(')');
        int iDelete = e().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            aT().c.c("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list.size()));
        }
    }

    public final void Q(String str) {
        try {
            e().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str, str});
        } catch (SQLiteException e2) {
            aT().c.c("Failed to remove unused event metadata. appId", lcz.a(str), e2);
        }
    }

    public final void R(Long l) {
        o();
        w();
        try {
            if (e().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                aT().f.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e2) {
            aT().c.b("Failed to delete a MeasurementBatch in a upload_queue table", e2);
            throw e2;
        }
    }

    public final void S() {
        w();
        e().endTransaction();
    }

    public final void T(String str, String str2, String str3, long j2, long j3) {
        long j4;
        o();
        w();
        kro.l(str);
        kro.l(str3);
        kro.i(str2);
        try {
            SQLiteDatabase sQLiteDatabaseE = e();
            String[] strArr = {str, str2, str3};
            boolean zF = G().F(str, lcl.bl);
            Cursor cursor = null;
            try {
                Cursor cursorQuery = sQLiteDatabaseE.query("diagnostic_signals", zF ? new String[]{"count", "sum"} : new String[]{"count"}, "app_id = ? AND signal_name = ? AND metadata = ?", strArr, null, null, null);
                try {
                    long j5 = 0;
                    if (cursorQuery.moveToFirst()) {
                        j4 = cursorQuery.getLong(0);
                        if (zF && !cursorQuery.isNull(1)) {
                            j5 = cursorQuery.getLong(1);
                        }
                    } else {
                        j4 = -1;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (j4 != -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("count", Long.valueOf(j4 + j2));
                        contentValues.put("last_increment_timestamp", Long.valueOf(System.currentTimeMillis()));
                        if (zF) {
                            contentValues.put("sum", Long.valueOf(j5 + j3));
                        }
                        if (sQLiteDatabaseE.update("diagnostic_signals", contentValues, "app_id = ? AND signal_name = ? AND metadata = ?", strArr) == 0) {
                            aT().c.c("Failed to update diagnostic signal count (got 0). appId, signalName", lcz.a(str), str2);
                            return;
                        }
                        return;
                    }
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("signal_name", str2);
                    contentValues2.put("metadata", str3);
                    contentValues2.put("last_increment_timestamp", Long.valueOf(System.currentTimeMillis()));
                    contentValues2.put("count", Long.valueOf(j2));
                    if (zF) {
                        contentValues2.put("sum", Long.valueOf(j3));
                    }
                    if (sQLiteDatabaseE.insertWithOnConflict("diagnostic_signals", null, contentValues2, 4) == -1) {
                        aT().c.c("Failed to insert diagnostic signal (got -1). appId, signalName", lcz.a(str), str2);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e2) {
            aT().c.d("Error storing diagnostic signal. appId, signalName", lcz.a(str), str2, e2);
        }
    }

    public final void U(Long l) {
        o();
        w();
        if (ae()) {
            if (c(a.bV(l, "SELECT COUNT(1) FROM upload_queue WHERE rowid = ", " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                aT().f.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e().execSQL("UPDATE upload_queue" + a.bS(System.currentTimeMillis(), " SET retry_count = retry_count + 1, last_upload_timestamp = ") + " WHERE rowid = " + l + " AND retry_count < 2147483647");
            } catch (SQLiteException e2) {
                aT().c.b("Error incrementing retry count. error", e2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    public final void V() {
        Throwable th;
        Cursor cursorQuery;
        o();
        w();
        if (ae()) {
            long jA = t().a.a();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > lbt.A()) {
                t().a.b(jElapsedRealtime);
                o();
                w();
                if (ae()) {
                    SQLiteDatabase sQLiteDatabaseE = e();
                    String[] strArr = {String.valueOf(System.currentTimeMillis()), String.valueOf(lbt.x())};
                    HashMap map = null;
                    map = null;
                    Cursor cursor = null;
                    map = null;
                    int iDelete = 0;
                    if (G().F(null, lcl.aR) && G().F(null, lcl.aX)) {
                        sQLiteDatabaseE.beginTransaction();
                        try {
                            cursorQuery = sQLiteDatabaseE.query("queue", new String[]{"app_id", "events_count"}, "ABS(bundle_end_timestamp - ?) > CAST(? AS INTEGER)", strArr, null, null, null);
                            try {
                                try {
                                    HashMap map2 = new HashMap();
                                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                                        do {
                                            String string = cursorQuery.getString(0);
                                            if (string != null) {
                                                long j2 = cursorQuery.getLong(1);
                                                if (j2 <= 0) {
                                                    j2 = 1;
                                                }
                                                Long l = (Long) map2.get(string);
                                                map2.put(string, Long.valueOf((l != null ? l.longValue() : 0L) + j2));
                                            }
                                        } while (cursorQuery.moveToNext());
                                    }
                                    int iDelete2 = sQLiteDatabaseE.delete("queue", "ABS(bundle_end_timestamp - ?) > CAST(? AS INTEGER)", strArr);
                                    sQLiteDatabaseE.setTransactionSuccessful();
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    sQLiteDatabaseE.endTransaction();
                                    map = map2;
                                    iDelete = iDelete2;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    aT().c.b("Error querying or deleting stale bundles for diagnostics", e);
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    sQLiteDatabaseE.endTransaction();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                sQLiteDatabaseE.endTransaction();
                                throw th;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            cursorQuery = null;
                        } catch (Throwable th3) {
                            th = th3;
                            if (cursor != null) {
                                cursor.close();
                            }
                            sQLiteDatabaseE.endTransaction();
                            throw th;
                        }
                    } else {
                        try {
                            iDelete = sQLiteDatabaseE.delete("queue", "ABS(bundle_end_timestamp - ?) > CAST(? AS INTEGER)", strArr);
                        } catch (SQLiteException e4) {
                            aT().c.b("Error deleting stale bundles", e4);
                        }
                    }
                    if (map != null && iDelete > 0) {
                        for (Map.Entry entry : map.entrySet()) {
                            T((String) entry.getKey(), "event_dropped_count", "expired", ((Long) entry.getValue()).longValue(), 0L);
                        }
                    }
                    if (iDelete > 0) {
                        aT().k.b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    public final void W(String str, String str2) {
        kro.i(str);
        kro.i(str2);
        o();
        w();
        try {
            e().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            aT().c.d("Error deleting user property. appId", lcz.a(str), I().e(str2), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cf A[ADDED_TO_REGION] */
    public final void X(String str) throws Throwable {
        boolean z;
        lca lcaVarJ;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        lca lcaVarJ2 = j("events", str, "_f");
        lca lcaVarJ3 = j("events", str, "_v");
        as("events", str);
        Cursor cursorQuery = null;
        boolean z2 = false;
        try {
            cursorQuery = e().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z3 = false;
                z = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (lcaVarJ = j("events_snapshot", str, string)) != null) {
                            aa("events", lcaVarJ);
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        z2 = z3;
                        try {
                            aT().c.c("Error querying snapshot. appId", lcz.a(str), e);
                            z3 = z2;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z2 && lcaVarJ2 != null) {
                                aa("events", lcaVarJ2);
                            } else if (!z && lcaVarJ3 != null) {
                                aa("events", lcaVarJ3);
                            }
                            as("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2) {
                            if (!z) {
                                aa("events", lcaVarJ3);
                            }
                        } else if (!z) {
                            aa("events", lcaVarJ3);
                        }
                        as("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z3 && lcaVarJ2 != null) {
                    aa("events", lcaVarJ2);
                } else if (!z && lcaVarJ3 != null) {
                    aa("events", lcaVarJ3);
                }
            } else {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (lcaVarJ2 != null) {
                    aa("events", lcaVarJ2);
                } else if (lcaVarJ3 != null) {
                    aa("events", lcaVarJ3);
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        as("events_snapshot", str);
    }

    public final void Y() {
        w();
        e().setTransactionSuccessful();
    }

    public final void Z(String str, boolean z) {
        kro.i(str);
        o();
        w();
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_app_in_background", Boolean.valueOf(z));
        try {
            if (e().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                aT().c.b("Failed to update background status (got -1). appId", lcz.a(str));
            }
        } catch (SQLiteException e2) {
            aT().c.c("Error updating app background status. appId", lcz.a(str), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02af  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:122:0x0322  */
    /* JADX WARN: Code duplicated, block: B:61:0x017c  */
    public final long a(String str, liq liqVar, String str2, Map map, lho lhoVar, Long l) throws Throwable {
        String str3;
        int iDelete;
        SQLiteDatabase sQLiteDatabase;
        long j2;
        int i2;
        int i3;
        Cursor cursor;
        Cursor cursorRawQuery;
        long j3;
        int iDelete2;
        o();
        w();
        kro.l(liqVar);
        kro.i(str);
        o();
        w();
        String str4 = "measurement_batch";
        int i4 = 0;
        Object obj = null;
        if (ae()) {
            long jA = t().b.a();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > lbt.A()) {
                t().b.b(jElapsedRealtime);
                if (G().F(null, lcl.bb) && G().F(null, lcl.aR)) {
                    o();
                    w();
                    int i5 = 1;
                    if (ae()) {
                        HashMap map2 = new HashMap();
                        SQLiteDatabase sQLiteDatabaseE = e();
                        sQLiteDatabaseE.beginTransaction();
                        try {
                            try {
                                String strAu = au();
                                int iDelete3 = 0;
                                j2 = 0;
                                while (true) {
                                    try {
                                        ArrayList arrayList = new ArrayList();
                                        Cursor cursorQuery = sQLiteDatabaseE.query("upload_queue", new String[]{"rowid", "app_id", str4}, strAu, null, null, null, "rowid ASC", String.valueOf(((Integer) lcl.E.b(obj)).intValue()));
                                        sQLiteDatabase = sQLiteDatabaseE;
                                        try {
                                            try {
                                                if (!cursorQuery.moveToFirst()) {
                                                    i3 = iDelete3;
                                                    str3 = str4;
                                                    cursorQuery.close();
                                                    break;
                                                }
                                                while (true) {
                                                    long j4 = cursorQuery.getLong(i4);
                                                    String string = cursorQuery.getString(i5);
                                                    kro.l(string);
                                                    arrayList.add(Long.valueOf(j4));
                                                    i3 = iDelete3;
                                                    int iA = u().a(string, cursorQuery.getBlob(2));
                                                    if (iA > 0) {
                                                        Long l2 = (Long) map2.get(string);
                                                        str3 = str4;
                                                        try {
                                                            map2.put(string, Long.valueOf((l2 == null ? 0L : l2.longValue()) + ((long) iA)));
                                                        } catch (SQLiteException e2) {
                                                            e = e2;
                                                            map2.clear();
                                                            aT().c.b("Error querying or deleting stale upload queue batches for diagnostics", e);
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            sQLiteDatabase.endTransaction();
                                                            i2 = 0;
                                                        }
                                                    } else {
                                                        str3 = str4;
                                                    }
                                                    if (!cursorQuery.moveToNext()) {
                                                        break;
                                                    }
                                                    iDelete3 = i3;
                                                    str4 = str3;
                                                    i5 = 1;
                                                    i4 = 0;
                                                }
                                                cursorQuery.close();
                                                try {
                                                    if (arrayList.isEmpty()) {
                                                        break;
                                                    }
                                                    iDelete3 = i3 + sQLiteDatabase.delete("upload_queue", "rowid in (" + TextUtils.join(",", arrayList) + ')', null);
                                                    sQLiteDatabaseE = sQLiteDatabase;
                                                    str4 = str3;
                                                    i5 = 1;
                                                    i4 = 0;
                                                    obj = null;
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    cursorQuery = null;
                                                    map2.clear();
                                                    aT().c.b("Error querying or deleting stale upload queue batches for diagnostics", e);
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    sQLiteDatabase.endTransaction();
                                                    i2 = 0;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cursorQuery = null;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    sQLiteDatabase.endTransaction();
                                                    throw th;
                                                }
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                str3 = str4;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                    } catch (SQLiteException e5) {
                                        e = e5;
                                        str3 = str4;
                                        sQLiteDatabase = sQLiteDatabaseE;
                                    }
                                }
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                i2 = i3;
                            } catch (SQLiteException e6) {
                                e = e6;
                                str3 = "measurement_batch";
                                sQLiteDatabase = sQLiteDatabaseE;
                                j2 = 0;
                            }
                            if (i2 > 0) {
                                aT().k.b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(i2));
                            }
                            for (Map.Entry entry : map2.entrySet()) {
                                T((String) entry.getKey(), "event_dropped_count", "sgtm_queue_expired", ((Long) entry.getValue()).longValue(), 0L);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteDatabase = sQLiteDatabaseE;
                        }
                    } else {
                        str3 = "measurement_batch";
                        j2 = 0;
                    }
                    kro.i(str);
                    o();
                    w();
                    int iC = G().C(str, lcl.B);
                    if (iC > 0) {
                        SQLiteDatabase sQLiteDatabaseE2 = e();
                        sQLiteDatabaseE2.beginTransaction();
                        try {
                            cursorRawQuery = sQLiteDatabaseE2.rawQuery("SELECT rowid, measurement_batch FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?", new String[]{str, String.valueOf(iC)});
                            try {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    long jA2 = j2;
                                    while (cursorRawQuery.moveToNext()) {
                                        arrayList2.add(Long.valueOf(cursorRawQuery.getLong(0)));
                                        jA2 += (long) u().a(str, cursorRawQuery.getBlob(1));
                                    }
                                    cursorRawQuery.close();
                                    int iC2 = G().C(str, lcl.E);
                                    int i6 = 0;
                                    iDelete2 = 0;
                                    while (i6 < arrayList2.size()) {
                                        int i7 = i6 + iC2;
                                        iDelete2 += sQLiteDatabaseE2.delete("upload_queue", "rowid in (" + TextUtils.join(",", arrayList2.subList(i6, Math.min(i7, arrayList2.size()))) + ')', null);
                                        i6 = i7;
                                    }
                                    sQLiteDatabaseE2.setTransactionSuccessful();
                                    sQLiteDatabaseE2.endTransaction();
                                    j3 = jA2;
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    aT().c.c("Error deleting over the limit queued batches. appId", lcz.a(str), e);
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    sQLiteDatabaseE2.endTransaction();
                                    j3 = j2;
                                    iDelete2 = 0;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cursor = cursorRawQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                sQLiteDatabaseE2.endTransaction();
                                throw th;
                            }
                        } catch (SQLiteException e8) {
                            e = e8;
                            cursorRawQuery = null;
                        } catch (Throwable th5) {
                            th = th5;
                            cursor = null;
                            if (cursor != null) {
                                cursor.close();
                            }
                            sQLiteDatabaseE2.endTransaction();
                            throw th;
                        }
                        if (iDelete2 > 0) {
                            aT().j.d("Deleted over the limit queued batches. appId, deletedEntries, deletedEvents", lcz.a(str), Integer.valueOf(iDelete2), Long.valueOf(j3));
                        }
                        if (j3 > j2) {
                            T(str, "event_dropped_count", "sgtm_queue_over_limit", j3, 0L);
                        }
                    }
                } else {
                    str3 = "measurement_batch";
                    o();
                    w();
                    if (ae() && (iDelete = e().delete("upload_queue", au(), new String[0])) > 0) {
                        aT().k.b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                    }
                    kro.i(str);
                    o();
                    w();
                    try {
                        int iC3 = G().C(str, lcl.B);
                        if (iC3 > 0) {
                            e().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iC3)});
                        }
                    } catch (SQLiteException e9) {
                        aT().c.c("Error deleting over the limit queued batches. appId", lcz.a(str), e9);
                    }
                }
            } else {
                str3 = "measurement_batch";
            }
        } else {
            str3 = "measurement_batch";
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry2 : map.entrySet()) {
            arrayList3.add(((String) entry2.getKey()) + '=' + ((String) entry2.getValue()));
        }
        byte[] byteArray = liqVar.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(str3, byteArray);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList3));
        contentValues.put("upload_type", Integer.valueOf(lhoVar.g));
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = e().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            aT().c.b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e10) {
            aT().c.c("Error storing MeasurementBatch to upload_queue. appId", str, e10);
            return -1L;
        }
    }

    public final void aa(String str, lca lcaVar) {
        kro.l(lcaVar);
        o();
        w();
        ContentValues contentValues = new ContentValues();
        String str2 = lcaVar.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", lcaVar.b);
        contentValues.put("lifetime_count", Long.valueOf(lcaVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(lcaVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(lcaVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(lcaVar.g));
        contentValues.put("last_bundled_day", lcaVar.h);
        contentValues.put("last_sampled_complex_event_id", lcaVar.i);
        contentValues.put("last_sampling_rate", lcaVar.j);
        contentValues.put("current_session_count", Long.valueOf(lcaVar.e));
        Boolean bool = lcaVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (e().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                aT().c.b("Failed to insert/update event aggregates (got -1). appId", lcz.a(str2));
            }
        } catch (SQLiteException e2) {
            aT().c.c("Error storing event aggregates. appId", lcz.a(lcaVar.a), e2);
        }
    }

    public final void ab(String str, lgh lghVar) {
        kro.l(str);
        kro.l(lghVar);
        o();
        w();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", lghVar.l());
        contentValues.put("consent_source", Integer.valueOf(lghVar.d));
        ao(contentValues);
    }

    public final boolean ac(String str) {
        lho[] lhoVarArr = {lho.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(lhoVarArr[0].g));
        String strAt = at(arrayList);
        String strAu = au();
        StringBuilder sb = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(strAt);
        sb.append(" AND NOT ");
        sb.append(strAu);
        return c(sb.toString(), new String[]{str}) != 0;
    }

    public final boolean ad(String str, String str2) {
        return c("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final boolean ae() {
        return aS().getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean af(lbq lbqVar) {
        o();
        w();
        String str = lbqVar.a;
        kro.l(str);
        if (ap(str, lbqVar.c.b) == null && c("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", lbqVar.b);
        contentValues.put("name", lbqVar.c.b);
        Object objA = lbqVar.c.a();
        kro.l(objA);
        al(contentValues, objA);
        contentValues.put("active", Boolean.valueOf(lbqVar.e));
        contentValues.put("trigger_event_name", lbqVar.f);
        contentValues.put("trigger_timeout", Long.valueOf(lbqVar.h));
        L();
        contentValues.put("timed_out_event", lga.aC(lbqVar.g));
        contentValues.put("creation_timestamp", Long.valueOf(lbqVar.d));
        L();
        contentValues.put("triggered_event", lga.aC(lbqVar.i));
        contentValues.put("triggered_timestamp", Long.valueOf(lbqVar.c.c));
        contentValues.put("time_to_live", Long.valueOf(lbqVar.j));
        L();
        contentValues.put("expired_event", lga.aC(lbqVar.k));
        try {
            if (e().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            aT().c.b("Failed to insert/update conditional user property (got -1)", lcz.a(str));
            return true;
        } catch (SQLiteException e2) {
            aT().c.c("Error storing conditional user property", lcz.a(str), e2);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    /* JADX WARN: Code duplicated, block: B:71:0x016e  */
    public final lgl ag(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) throws Throwable {
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        Cursor cursor;
        lgl lglVar;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        kro.i(str);
        o();
        w();
        String[] strArr = {str};
        Cursor cursorQuery = null;
        long j16 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseE = e();
                cursorQuery = sQLiteDatabaseE.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j2) {
                        j4 = cursorQuery.getLong(1);
                        try {
                            j11 = cursorQuery.getLong(2);
                            try {
                                j12 = cursorQuery.getLong(3);
                                try {
                                    j13 = cursorQuery.getLong(4);
                                    try {
                                        j14 = cursorQuery.getLong(5);
                                        try {
                                            j16 = cursorQuery.getLong(6);
                                            j15 = cursorQuery.getLong(7);
                                            j10 = j16;
                                            j16 = j4;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            j8 = j16;
                                            j9 = j11;
                                            j5 = j12;
                                            j6 = j13;
                                            j7 = j14;
                                            try {
                                                cursor = cursorQuery;
                                                try {
                                                    aT().c.c("Error updating daily counts. appId", lcz.a(str), e);
                                                    cursorQuery = cursor;
                                                    lglVar = new lgl(j9, j4, j5, j6, j7, j8);
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    return lglVar;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cursorQuery = cursor;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                cursor = cursorQuery;
                                            }
                                        }
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        j8 = 0;
                                        j9 = j11;
                                        j5 = j12;
                                        j6 = j13;
                                        j7 = 0;
                                    }
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    j7 = 0;
                                    j8 = 0;
                                    j9 = j11;
                                    j5 = j12;
                                    j6 = 0;
                                }
                            } catch (SQLiteException e5) {
                                e = e5;
                                j6 = 0;
                                j7 = 0;
                                j8 = 0;
                                j9 = j11;
                                j5 = 0;
                            }
                        } catch (SQLiteException e6) {
                            e = e6;
                            j5 = 0;
                            j6 = j5;
                            j7 = j6;
                            j8 = j7;
                            j9 = j8;
                            cursor = cursorQuery;
                            aT().c.c("Error updating daily counts. appId", lcz.a(str), e);
                            cursorQuery = cursor;
                            lglVar = new lgl(j9, j4, j5, j6, j7, j8);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return lglVar;
                        }
                    } else {
                        j10 = 0;
                        j11 = 0;
                        j12 = 0;
                        j13 = 0;
                        j14 = 0;
                        j15 = 0;
                    }
                    if (z) {
                        j16 += j3;
                    }
                    long j17 = j16;
                    if (z2) {
                        j11 += j3;
                    }
                    long j18 = j11;
                    if (z3) {
                        j12 += j3;
                    }
                    long j19 = j12;
                    if (z4) {
                        j13 += j3;
                    }
                    long j20 = j13;
                    if (z5) {
                        j14 += j3;
                    }
                    long j21 = j14;
                    if (z6) {
                        j10 += j3;
                    }
                    long j22 = j10;
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("day", Long.valueOf(j2));
                        contentValues.put("daily_public_events_count", Long.valueOf(j18));
                        contentValues.put("daily_events_count", Long.valueOf(j17));
                        contentValues.put("daily_conversions_count", Long.valueOf(j19));
                        contentValues.put("daily_error_events_count", Long.valueOf(j20));
                        contentValues.put("daily_realtime_events_count", Long.valueOf(j21));
                        contentValues.put("daily_realtime_dcu_count", Long.valueOf(j22));
                        contentValues.put("daily_registered_triggers_count", Long.valueOf(j15));
                        sQLiteDatabaseE.update("apps", contentValues, "app_id=?", strArr);
                        lglVar = new lgl(j18, j17, j19, j20, j21, j22);
                    } catch (SQLiteException e7) {
                        e = e7;
                        j9 = j18;
                        j4 = j17;
                        j5 = j19;
                        j6 = j20;
                        j7 = j21;
                        j8 = j22;
                        cursor = cursorQuery;
                        aT().c.c("Error updating daily counts. appId", lcz.a(str), e);
                        cursorQuery = cursor;
                        lglVar = new lgl(j9, j4, j5, j6, j7, j8);
                    }
                } else {
                    aT().f.b("Not updating daily counts, app is not known. appId", lcz.a(str));
                    lglVar = lgl.a;
                }
            } catch (SQLiteException e8) {
                e = e8;
                j4 = 0;
                j5 = 0;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return lglVar;
        } catch (Throwable th3) {
            th = th3;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final void ah(lir lirVar, boolean z) {
        o();
        w();
        kro.l(lirVar);
        kro.i(lirVar.r);
        if ((lirVar.b & 8) == 0) {
            throw new IllegalStateException();
        }
        V();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (lirVar.i < jCurrentTimeMillis - lbt.x() || lirVar.i > lbt.x() + jCurrentTimeMillis) {
            aT().f.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", lcz.a(lirVar.r), Long.valueOf(jCurrentTimeMillis), Long.valueOf(lirVar.i));
        }
        try {
            byte[] bArrN = u().N(lirVar.toByteArray());
            aT().k.b("Saving bundle, size", Integer.valueOf(bArrN.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", lirVar.r);
            contentValues.put("bundle_end_timestamp", Long.valueOf(lirVar.i));
            contentValues.put("data", bArrN);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            contentValues.put("events_count", Integer.valueOf(lirVar.e.size()));
            if ((lirVar.c & 2) != 0) {
                contentValues.put("retry_count", Integer.valueOf(lirVar.J));
            }
            try {
                if (e().insert("queue", null, contentValues) == -1) {
                    aT().c.b("Failed to insert bundle (got -1). appId", lcz.a(lirVar.r));
                }
            } catch (SQLiteException e2) {
                aT().c.c("Error storing bundle. appId", lcz.a(lirVar.r), e2);
            }
        } catch (IOException e3) {
            aT().c.c("Data loss. Failed to serialize bundle. appId", lcz.a(lirVar.r), e3);
        }
    }

    public final List ai(String str, lfm lfmVar, int i2) {
        List arrayList;
        o();
        w();
        Cursor cursorQuery = null;
        try {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            if (TextUtils.isEmpty(str)) {
                sb.append("1=1");
            } else {
                sb.append("app_id=?");
                arrayList2.add(str);
            }
            sb.append(at(lfmVar.a));
            sb.append(" AND NOT ");
            sb.append(au());
            cursorQuery = e().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, sb.toString(), (String[]) arrayList2.toArray(new String[0]), null, null, "creation_timestamp ASC", i2 > 0 ? String.valueOf(i2) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                long j2 = cursorQuery.getLong(0);
                String string = cursorQuery.getString(1);
                kro.l(string);
                lfw lfwVarK = k(j2, string, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (lfwVarK != null) {
                    arrayList.add(lfwVarK);
                }
            }
        } catch (SQLiteException e2) {
            aT().c.c("Error when querying MeasurementBatch from upload_queue. appId", str, e2);
            arrayList = Collections.EMPTY_LIST;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final void aj(String str, String str2) {
        kro.i(str);
        kro.i(str2);
        o();
        w();
        try {
            e().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            aT().c.d("Error deleting conditional property", lcz.a(str), I().e(str2), e2);
        }
    }

    public final void ak(String str, Long l, long j2, lin linVar) {
        o();
        w();
        kro.l(linVar);
        kro.i(str);
        byte[] byteArray = linVar.toByteArray();
        aT().k.c("Saving complex main event, appId, data size", I().c(str), Integer.valueOf(byteArray.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", byteArray);
        try {
            if (e().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                aT().c.b("Failed to insert complex main event (got -1). appId", lcz.a(str));
            }
        } catch (SQLiteException e2) {
            aT().c.c("Error storing complex main event. appId", lcz.a(str), e2);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x002f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String am(java.lang.String r3, java.lang.String[] r4) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.e()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L2f
            boolean r4 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L2f
            if (r4 == 0) goto L1a
            r4 = 0
            java.lang.String r2 = r1.getString(r4)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L2f
            if (r1 == 0) goto L21
            r1.close()
            goto L21
        L1a:
            if (r1 == 0) goto L1f
            r1.close()
        L1f:
            java.lang.String r2 = ""
        L21:
            return r2
        L22:
            r4 = move-exception
            lcz r2 = r2.aT()     // Catch: java.lang.Throwable -> L2f
            lcx r2 = r2.c     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "Database error"
            r2.c(r0, r3, r4)     // Catch: java.lang.Throwable -> L2f
            throw r4     // Catch: java.lang.Throwable -> L2f
        L2f:
            r2 = move-exception
            if (r1 == 0) goto L35
            r1.close()
        L35:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgp.am(java.lang.String, java.lang.String[]):java.lang.String");
    }

    public final void an(lbd lbdVar, boolean z) {
        o();
        w();
        String strW = lbdVar.w();
        kro.l(strW);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strW);
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.l.u(strW).o()) {
            contentValues.put("app_instance_id", lbdVar.x());
        }
        contentValues.put("gmp_app_id", lbdVar.B());
        lfv lfvVar = this.l;
        if (lfvVar.u(strW).m()) {
            contentValues.put("resettable_device_id_hash", lbdVar.C());
        }
        contentValues.put("last_bundle_index", Long.valueOf(lbdVar.l()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(lbdVar.m()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(lbdVar.k()));
        contentValues.put("app_version", lbdVar.z());
        contentValues.put("app_store", lbdVar.y());
        contentValues.put("gmp_version", Long.valueOf(lbdVar.i()));
        contentValues.put("dev_cert_hash", Long.valueOf(lbdVar.f()));
        contentValues.put("measurement_enabled", Boolean.valueOf(lbdVar.au()));
        ldr ldrVar = lbdVar.a;
        ldrVar.r();
        contentValues.put("day", Long.valueOf(lbdVar.h));
        ldrVar.r();
        contentValues.put("daily_public_events_count", Long.valueOf(lbdVar.i));
        ldrVar.r();
        contentValues.put("daily_events_count", Long.valueOf(lbdVar.j));
        ldrVar.r();
        contentValues.put("daily_conversions_count", Long.valueOf(lbdVar.k));
        contentValues.put("config_fetched_time", Long.valueOf(lbdVar.e()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(lbdVar.h()));
        contentValues.put("app_version_int", Long.valueOf(lbdVar.c()));
        contentValues.put("firebase_instance_id", lbdVar.A());
        ldrVar.r();
        contentValues.put("daily_error_events_count", Long.valueOf(lbdVar.l));
        ldrVar.r();
        contentValues.put("daily_realtime_events_count", Long.valueOf(lbdVar.m));
        ldrVar.r();
        contentValues.put("health_monitor_sample", lbdVar.n);
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(lbdVar.as()));
        contentValues.put("dynamite_version", Long.valueOf(lbdVar.g()));
        if (lfvVar.u(strW).o()) {
            contentValues.put("session_stitching_token", lbdVar.E());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(lbdVar.aw()));
        contentValues.put("target_os_version", Long.valueOf(lbdVar.r()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(lbdVar.p()));
        autd.c();
        if (G().F(strW, lcl.aN)) {
            contentValues.put("ad_services_version", Integer.valueOf(lbdVar.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(lbdVar.d()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(lbdVar.ax()));
        contentValues.put("npa_metadata_value", lbdVar.s());
        contentValues.put("bundle_delivery_index", Long.valueOf(lbdVar.j()));
        contentValues.put("sgtm_preview_key", lbdVar.F());
        ldrVar.r();
        contentValues.put("dma_consent_state", Integer.valueOf(lbdVar.e));
        ldrVar.r();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(lbdVar.f));
        contentValues.put("serialized_npa_metadata", lbdVar.D());
        contentValues.put("client_upload_eligibility", Integer.valueOf(lbdVar.b()));
        List listG = lbdVar.G();
        if (listG != null) {
            if (listG.isEmpty()) {
                aT().f.b("Safelisted events should not be an empty list. appId", strW);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listG));
            }
        }
        ausf.c();
        if (G().F(null, lcl.aK) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", lbdVar.t());
        contentValues.put("unmatched_uwa", lbdVar.u());
        contentValues.put("ad_campaign_info", lbdVar.ay());
        if (G().F(strW, lcl.aR)) {
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(lbdVar.n()));
        }
        if (G().F(strW, lcl.bg)) {
            contentValues.put("last_session_checkpoint_timestamp", Long.valueOf(lbdVar.o()));
            contentValues.put("is_app_in_background", Boolean.valueOf(lbdVar.at()));
            contentValues.put("session_timeout_millis", Long.valueOf(lbdVar.q()));
        }
        try {
            SQLiteDatabase sQLiteDatabaseE = e();
            if (sQLiteDatabaseE.update("apps", contentValues, "app_id = ?", new String[]{strW}) == 0 && sQLiteDatabaseE.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                aT().c.b("Failed to insert/update app (got -1). appId", lcz.a(strW));
            }
        } catch (SQLiteException e2) {
            aT().c.c("Error storing app. appId", lcz.a(strW), e2);
        }
    }

    public final void ao(ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseE = e();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                aT().e.b("Value of the primary key is not set.", lcz.a("app_id"));
            } else if (sQLiteDatabaseE.update("consent_settings", contentValues, "app_id = ?", new String[]{asString}) == 0 && sQLiteDatabaseE.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                aT().c.c("Failed to insert/update table (got -1). key", lcz.a("consent_settings"), lcz.a("app_id"));
            }
        } catch (SQLiteException e2) {
            aT().c.d("Error storing into table. key", lcz.a("consent_settings"), lcz.a("app_id"), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0092: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:147), block:B:30:0x0091 */
    public final aaqp ap(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        Cursor cursor;
        kro.i(str);
        kro.i(str2);
        o();
        w();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = e().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j2 = cursorQuery.getLong(0);
                        Object objP = p(cursorQuery, 1);
                        if (objP != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                aaqp aaqpVar = new aaqp(str3, cursorQuery.getString(2), str4, j2, objP);
                                if (cursorQuery.moveToNext()) {
                                    aT().c.b("Got multiple records for user property, expected one. appId", lcz.a(str3));
                                }
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return aaqpVar;
                            } catch (SQLiteException e2) {
                                e = e2;
                                sQLiteException = e;
                                aT().c.d("Error querying user property. appId", lcz.a(str3), I().e(str4), sQLiteException);
                                if (cursorQuery != null) {
                                    return null;
                                }
                                cursorQuery.close();
                                return null;
                            }
                        }
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    str3 = str;
                    str4 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e4) {
            str3 = str;
            str4 = str2;
            sQLiteException = e4;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }
        if (cursorQuery != null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    public final boolean aq(aaqp aaqpVar) {
        o();
        w();
        Object obj = aaqpVar.b;
        String str = (String) obj;
        Object obj2 = aaqpVar.d;
        String str2 = (String) obj2;
        if (ap(str, str2) == null) {
            if (lga.an(str2)) {
                if (c("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= G().D(str, lcl.ag, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(obj2) && c("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, (String) aaqpVar.e}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", (String) aaqpVar.e);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(aaqpVar.a));
        al(contentValues, aaqpVar.c);
        try {
            if (e().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                aT().c.b("Failed to insert/update user property (got -1). appId", lcz.a((String) obj));
            }
        } catch (SQLiteException e2) {
            aT().c.c("Error storing user property. appId", lcz.a((String) aaqpVar.b), e2);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:? A[SYNTHETIC] */
    public final xsc ar(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        kro.i(str);
        o();
        w();
        Cursor cursor = null;
        try {
            cursorQuery = e().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            aT().c.b("Got multiple records for app config, expected one. appId", lcz.a(str));
                        }
                        if (blob != null) {
                            xsc xscVar = new xsc((Object) blob, (Object) string, (Object) string2, (byte[]) null);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return xscVar;
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    aT().c.c("Error querying remote config. appId", lcz.a(str), e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery == null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    @Override // defpackage.lfo
    protected final void b() {
        aU().j(new lei(this, 9));
    }

    public final long c(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = e().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j2;
            } catch (SQLiteException e2) {
                aT().c.c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long d(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = e().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j2 = cursorRawQuery.getLong(0);
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j2;
            } catch (SQLiteException e2) {
                aT().c.c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final SQLiteDatabase e() {
        o();
        try {
            return this.o.getWritableDatabase();
        } catch (SQLiteException e2) {
            aT().f.b("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0073: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:116), block:B:26:0x0073 */
    public final Bundle g(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        o();
        w();
        Cursor cursor2 = null;
        bundleQ = null;
        Bundle bundleQ = null;
        try {
            try {
                cursorRawQuery = e().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            lin linVar = (lin) ((aihf) lfx.l(lin.a.createBuilder(), cursorRawQuery.getBlob(0))).build();
                            u();
                            bundleQ = lfx.Q(linVar.c);
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                        } catch (IOException e2) {
                            aT().c.c("Failed to retrieve default event parameters. appId", lcz.a(str), e2);
                            if (cursorRawQuery != null) {
                            }
                            return bundleQ;
                        }
                        return bundleQ;
                    }
                    aT().k.a("Default event parameters not found");
                } catch (SQLiteException e3) {
                    e = e3;
                    aT().c.b("Error selecting default event parameters", e);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return bundleQ;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:156:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x03f5: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:1014), block:B:154:0x03f5 */
    public final lbd h(String str) {
        lgp lgpVar;
        Cursor cursorQuery;
        Cursor cursor;
        Boolean boolValueOf;
        String string;
        kro.i(str);
        o();
        w();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = e().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp", "last_session_checkpoint_timestamp", "is_app_in_background", "session_timeout_millis"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        lgpVar = this;
                        try {
                            lfv lfvVar = lgpVar.l;
                            lbd lbdVar = new lbd(lfvVar.j, str);
                            if (lfvVar.u(str).o()) {
                                lbdVar.M(cursorQuery.getString(0));
                            }
                            lbdVar.W(cursorQuery.getString(1));
                            if (lfvVar.u(str).m()) {
                                lbdVar.ag(cursorQuery.getString(2));
                            }
                            lbdVar.aa(cursorQuery.getLong(3));
                            lbdVar.ab(cursorQuery.getLong(4));
                            lbdVar.Z(cursorQuery.getLong(5));
                            lbdVar.O(cursorQuery.getString(6));
                            lbdVar.N(cursorQuery.getString(7));
                            lbdVar.X(cursorQuery.getLong(8));
                            lbdVar.S(cursorQuery.getLong(9));
                            lbdVar.ae(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                            long j2 = cursorQuery.getLong(11);
                            ldr ldrVar = lbdVar.a;
                            ldrVar.r();
                            lbdVar.o |= lbdVar.h != j2;
                            lbdVar.h = j2;
                            long j3 = cursorQuery.getLong(12);
                            ldrVar.r();
                            lbdVar.o |= lbdVar.i != j3;
                            lbdVar.i = j3;
                            long j4 = cursorQuery.getLong(13);
                            ldrVar.r();
                            lbdVar.o |= lbdVar.j != j4;
                            lbdVar.j = j4;
                            long j5 = cursorQuery.getLong(14);
                            ldrVar.r();
                            lbdVar.o |= lbdVar.k != j5;
                            lbdVar.k = j5;
                            lbdVar.R(cursorQuery.getLong(15));
                            lbdVar.U(cursorQuery.getLong(16));
                            lbdVar.P(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                            lbdVar.V(cursorQuery.getString(18));
                            long j6 = cursorQuery.getLong(19);
                            ldrVar.r();
                            lbdVar.o |= lbdVar.l != j6;
                            lbdVar.l = j6;
                            long j7 = cursorQuery.getLong(20);
                            ldrVar.r();
                            lbdVar.o |= lbdVar.m != j7;
                            lbdVar.m = j7;
                            lbdVar.Y(cursorQuery.getString(21));
                            lbdVar.K(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                            lbdVar.T(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                            if (!cursorQuery.isNull(26)) {
                                lbdVar.ah(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                            }
                            if (lfvVar.u(str).o()) {
                                lbdVar.aj(cursorQuery.getString(28));
                            }
                            lbdVar.an((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                            long j8 = cursorQuery.getLong(39);
                            ldrVar.r();
                            lbdVar.o |= lbdVar.g != j8;
                            lbdVar.g = j8;
                            lbdVar.am(cursorQuery.getString(36));
                            lbdVar.ao(cursorQuery.getLong(30));
                            lbdVar.ak(cursorQuery.getLong(31));
                            autd.c();
                            if (lgpVar.G().F(str, lcl.aN)) {
                                lbdVar.J(cursorQuery.getInt(32));
                                long j9 = cursorQuery.getLong(35);
                                ldrVar.r();
                                lbdVar.o |= lbdVar.d != j9;
                                lbdVar.d = j9;
                            }
                            lbdVar.ap((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                            if (cursorQuery.isNull(34)) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                            }
                            lbdVar.af(boolValueOf);
                            int i2 = cursorQuery.getInt(37);
                            ldrVar.r();
                            lbdVar.o |= lbdVar.e != i2;
                            lbdVar.e = i2;
                            int i3 = cursorQuery.getInt(38);
                            ldrVar.r();
                            lbdVar.o |= lbdVar.f != i3;
                            lbdVar.f = i3;
                            if (cursorQuery.isNull(40)) {
                                string = "";
                            } else {
                                string = cursorQuery.getString(40);
                                kro.l(string);
                            }
                            lbdVar.ai(string);
                            if (!cursorQuery.isNull(41)) {
                                lbdVar.aq(Long.valueOf(cursorQuery.getLong(41)));
                            }
                            if (!cursorQuery.isNull(42)) {
                                lbdVar.ar(Long.valueOf(cursorQuery.getLong(42)));
                            }
                            lbdVar.I(cursorQuery.getBlob(43));
                            if (!cursorQuery.isNull(44)) {
                                lbdVar.Q(cursorQuery.getInt(44));
                            }
                            if (lgpVar.G().F(str, lcl.aR) && !cursorQuery.isNull(45)) {
                                lbdVar.ac(cursorQuery.getLong(45));
                            }
                            if (lgpVar.G().F(str, lcl.bg)) {
                                if (!cursorQuery.isNull(46)) {
                                    lbdVar.ad(cursorQuery.getLong(46));
                                }
                                if (!cursorQuery.isNull(47)) {
                                    lbdVar.L(cursorQuery.getInt(47) != 0);
                                }
                                if (!cursorQuery.isNull(48)) {
                                    lbdVar.al(cursorQuery.getLong(48));
                                }
                            }
                            ldrVar.r();
                            lbdVar.o = false;
                            if (cursorQuery.moveToNext()) {
                                lgpVar.aT().c.b("Got multiple records for app, expected one. appId", lcz.a(str));
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return lbdVar;
                        } catch (SQLiteException e2) {
                            e = e2;
                            lgpVar.aT().c.c("Error querying app. appId", lcz.a(str), e);
                            if (cursorQuery != null) {
                                return null;
                            }
                            cursorQuery.close();
                            return null;
                        }
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    lgpVar = this;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            lgpVar = this;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0109  */
    /* JADX WARN: Code duplicated, block: B:36:0x0111  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final lbq i(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        kro.i(str);
        kro.i(str2);
        o();
        w();
        Cursor cursor = null;
        try {
            cursorQuery = e().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        String str4 = string;
                        Object objP = p(cursorQuery, 1);
                        boolean z = cursorQuery.getInt(2) != 0;
                        String string2 = cursorQuery.getString(3);
                        long j2 = cursorQuery.getLong(4);
                        str3 = str2;
                        try {
                            lbq lbqVar = new lbq(str, str4, new lfy(str3, cursorQuery.getLong(8), objP, str4), cursorQuery.getLong(6), z, string2, (lcd) u().i(cursorQuery.getBlob(5), lcd.CREATOR), j2, (lcd) u().i(cursorQuery.getBlob(7), lcd.CREATOR), cursorQuery.getLong(9), (lcd) u().i(cursorQuery.getBlob(10), lcd.CREATOR));
                            if (cursorQuery.moveToNext()) {
                                aT().c.c("Got multiple records for conditional property, expected one", lcz.a(str), I().e(str3));
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return lbqVar;
                        } catch (SQLiteException e2) {
                            e = e2;
                            aT().c.d("Error querying conditional property", lcz.a(str), I().e(str3), e);
                            if (cursorQuery != null) {
                                return null;
                            }
                            cursorQuery.close();
                            return null;
                        }
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0122  */
    public final lca j(String str, String str2, String str3) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        kro.i(str2);
        kro.i(str3);
        o();
        w();
        Cursor cursor = null;
        try {
            cursorQuery = e().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j2 = cursorQuery.getLong(0);
                        long j3 = cursorQuery.getLong(1);
                        long j4 = cursorQuery.getLong(2);
                        long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        lca lcaVar = new lca(str2, str3, j2, j3, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j4, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            aT().c.b("Got multiple records for event aggregates, expected one. appId", lcz.a(str2));
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return lcaVar;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    aT().c.d("Error querying events. appId", lcz.a(str2), I().c(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery == null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    public final lfw k(long j2, String str, byte[] bArr, String str2, String str3, int i2, int i3, long j3, long j4, long j5) {
        lho lhoVar;
        if (TextUtils.isEmpty(str2)) {
            aT().j.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            aihf aihfVar = (aihf) lfx.l(liq.a.createBuilder(), bArr);
            lho[] lhoVarArrValues = lho.values();
            int length = lhoVarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    lhoVar = lho.UNKNOWN;
                    break;
                }
                lhoVar = lhoVarArrValues[i4];
                if (lhoVar.g == i2) {
                    break;
                }
                i4++;
            }
            lho lhoVar2 = lhoVar;
            if (lhoVar2 != lho.GOOGLE_SIGNAL && lhoVar2 != lho.GOOGLE_SIGNAL_PENDING && i3 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = DesugarCollections.unmodifiableList(((liq) aihfVar.instance).c).iterator();
                while (it.hasNext()) {
                    aihf builder = ((lir) it.next()).toBuilder();
                    builder.copyOnWrite();
                    lir lirVar = (lir) builder.instance;
                    lirVar.c |= 2;
                    lirVar.J = i3;
                    arrayList.add((lir) builder.build());
                }
                aihfVar.copyOnWrite();
                ((liq) aihfVar.instance).c = liq.emptyProtobufList();
                aihfVar.G(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        aT().c.b("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new lfw(j2, str, (liq) aihfVar.build(), str2, map, lhoVar2, j3, j4, j5, i3);
        } catch (IOException e2) {
            aT().c.c("Failed to queue MeasurementBatch from upload_queue. appId", str, e2);
            return null;
        }
    }

    public final lgh l(String str) {
        kro.l(str);
        o();
        w();
        return lgh.g(am("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}), 100);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054 A[ExcSplitCross -> B:21:0x0054, PHI: r1
      0x0054: PHI (r1v9 lgh) = (r1v8 lgh), (r1v12 lgh) binds: [B:10:0x003a, B:7:0x0029] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final lgh m(String str) {
        SQLiteException e2;
        kro.l(str);
        o();
        w();
        ?? RawQuery = {str};
        ?? r1 = 0;
        lghVarG = null;
        lghVarG = null;
        lghVarG = null;
        lgh lghVarG = null;
        try {
            try {
                RawQuery = e().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", RawQuery);
                try {
                    if (RawQuery.moveToFirst()) {
                        lghVarG = lgh.g(RawQuery.getString(0), RawQuery.getInt(1));
                        if (RawQuery != 0) {
                            RawQuery = RawQuery;
                            RawQuery.close();
                        } else {
                            RawQuery = RawQuery;
                        }
                    } else {
                        aT().k.a("No data found");
                        if (RawQuery != 0) {
                            RawQuery = RawQuery;
                            RawQuery = RawQuery;
                            RawQuery.close();
                        } else {
                            RawQuery = RawQuery;
                        }
                    }
                } catch (SQLiteException e3) {
                    e2 = e3;
                    aT().c.b("Error querying database.", e2);
                    RawQuery = RawQuery;
                    if (RawQuery != 0) {
                    }
                    if (lghVarG == null) {
                        return lgh.a;
                    }
                    return lghVarG;
                }
            } catch (Throwable th) {
                th = th;
                r1 = RawQuery;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            RawQuery = 0;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        if (lghVarG == null) {
            return lgh.a;
        }
        return lghVarG;
    }

    final Object p(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            aT().c.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            aT().c.b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        aT().c.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[PHI: r0 r1
      0x002d: PHI (r0v5 android.database.Cursor) = (r0v4 android.database.Cursor), (r0v6 android.database.Cursor) binds: [B:16:0x002b, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r1v5 java.lang.String) = (r1v9 java.lang.String), (r1v8 java.lang.String) binds: [B:16:0x002b, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0035  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final String q() throws Throwable {
        SQLiteException e2;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseE = e();
        ?? r1 = 0;
        string = null;
        String string = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseE.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        string = cursorRawQuery.getString(0);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    } else if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (SQLiteException e3) {
                    e2 = e3;
                    aT().c.b("Database error getting next bundle app id", e2);
                }
            } catch (Throwable th) {
                th = th;
                r1 = sQLiteDatabaseE;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        return string;
    }

    public final List r(String str, String str2, String str3) {
        kro.i(str);
        o();
        w();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return A(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }
}
