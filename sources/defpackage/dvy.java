package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dvy {
    public static final dve a;
    public static final dve b;
    public static final dve c;
    public static final dve d;
    public static final dve e;
    public static final dve f;
    public static final dve g;
    public static final dve h;
    public static final dve i;

    static {
        new dvc("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        new dvc("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        new dvg("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        new dvd("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        new dvh("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        new dvh("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        new dvh("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        new dvh("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        new dvh("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        new dvh("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        new dvd("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        new dvd("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        new dvd("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        new dvd("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        new dvd("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        new dvd("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        new dvc("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        new dvc("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        new dvd("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        new dvh("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        new dvd("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        new dvc("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        new dvc("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        new dvh("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        new dvh("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        new dvh("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        new dvc("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        new dvc("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        a = new dve("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        new dvc("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        new dvc("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        new dvc("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        new dvc("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        new dvg("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        new dvg("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        new dvj("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        new dvj("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        new dvi();
        new dvp();
        new dvp();
        new dvp();
        new dvj("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        new dvu();
        new dve("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        b = new dve("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        new dvj("FORCE_DARK", "FORCE_DARK");
        new dve("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        c = new dve("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        new dve("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        new dve("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        new dve("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        new dve("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        new dve("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        new dve("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        d = new dve("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        new dvv();
        e = new dvw();
        new dve("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        new dve("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        f = new dve("MUTE_AUDIO", "MUTE_AUDIO");
        new dve("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
        new dve("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");
        new dve("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
        new dve("BACK_FORWARD_CACHE_SETTINGS", "BACK_FORWARD_CACHE_SETTINGS");
        new dve("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V3", "BACK_FORWARD_CACHE_SETTINGS_V3");
        new dve("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V4", "BACK_FORWARD_CACHE_SETTINGS_V4");
        g = new dve("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");
        new dvx();
        new dvf("ASYNC_WEBVIEW_STARTUP_V2");
        new dvf("ASYNC_WEBVIEW_STARTUP");
        new dvf("ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS");
        new dve("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");
        new dve("PRERENDER_URL_V2", "PRERENDER_URL_V3");
        new dve("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");
        new dve("PREFETCH_CACHE_V1", "PREFETCH_CACHE_V1");
        new dvf("PREFETCH_WITH_CALLBACK_RESULT_V1");
        new dve("SET_MAX_PRERENDERS_V1", "SET_MAX_PRERENDERS_V1");
        new dve("SAVE_STATE", "SAVE_STATE");
        new dve("NAVIGATION_GET_WEB_RESOURCE_ERROR", "NAVIGATION_GET_WEB_RESOURCE_ERROR");
        new dve("NAVIGATION_LISTENER", "PAGE_GET_URL");
        h = new dve("PROVIDER_WEAKLY_REF_WEBVIEW", "PROVIDER_WEAKLY_REF_WEBVIEW");
        i = new dve("PAYMENT_REQUEST", "PAYMENT_REQUEST");
        new dve("WEBVIEW_BUILDER_EXPERIMENTAL_V1", "WEBVIEW_BUILDER_V1");
        new dve("WEBVIEW_BUILDER_EXPERIMENTAL_V2", "WEBVIEW_BUILDER_V2");
        new dve("COOKIE_INTERCEPT", "COOKIE_INTERCEPT");
        new dve("WARM_UP_RENDERER_PROCESS", "WARM_UP_RENDERER_PROCESS");
        new dve("CUSTOM_REQUEST_HEADERS", "CUSTOM_REQUEST_HEADERS");
        new dvp();
        new dvp();
        new dvp();
        new dve("PRECONNECT", "PRECONNECT");
        new dve("ENQUEUE_PRECONNECT", "ENQUEUE_PRECONNECT");
        new dve("ADD_QUIC_HINTS", "ADD_QUIC_HINTS_V1");
        new dve("ADD_QUIC_HINTS_WILDCARDS", "ADD_QUIC_HINTS_WILDCARDS");
        new dve("HYPERLINK_CONTEXT_MENU_ITEMS", "HYPERLINK_CONTEXT_MENU_ITEMS");
        new dve("JS_INJECTION_IN_FRAME_AND_WORLD", "JS_INJECTION_IN_FRAME_AND_WORLD");
        new dve("WEBVIEW_NAVIGATE_EXPERIMENTAL_V1", "WEBVIEW_NAVIGATE_V1");
        new dve("WEBVIEW_NAVIGATE_DRAIN_PREFETCH", "WEBVIEW_NAVIGATE_DRAIN_PREFETCH");
        new dve("DOWNLOAD_FAVICONS_ENABLED", "DOWNLOAD_FAVICONS_ENABLED");
        new dve("HTTP_CACHE_MANAGER", "HTTP_CACHE_MANAGER");
        new dve("CROSS_ORIGIN_ISOLATED_ALLOWLIST", "CROSS_ORIGIN_ISOLATED_ALLOW_LIST");
        new dve("NAVIGATION_GET_RESPONSE_HEADERS", "NAVIGATION_GET_RESPONSE_HEADERS");
    }

    public static boolean a(String str) {
        Set<dvm> setUnmodifiableSet = DesugarCollections.unmodifiableSet(dvl.a);
        HashSet hashSet = new HashSet();
        for (dvm dvmVar : setUnmodifiableSet) {
            if (dvmVar.b().equals(str)) {
                hashSet.add(dvmVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((dvm) it.next()).c()) {
                return true;
            }
        }
        return false;
    }
}
