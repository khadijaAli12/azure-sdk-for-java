// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternalNetworkInner;
import com.azure.resourcemanager.managednetworkfabric.models.AllowASOverride;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.ConnectedSubnet;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.Extension;
import com.azure.resourcemanager.managednetworkfabric.models.ImportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetworkPropertiesBgpConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetworkPropertiesStaticRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetworksList;
import com.azure.resourcemanager.managednetworkfabric.models.IsMonitoringEnabled;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborAddress;
import com.azure.resourcemanager.managednetworkfabric.models.StaticRouteProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class InternalNetworksListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InternalNetworksList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"vlanId\":1621268309,\"bgpConfiguration\":{\"bfdConfiguration\":{\"administrativeState\":\"RMA\",\"intervalInMilliSeconds\":1775502514,\"multiplier\":1579715380},\"defaultRouteOriginate\":\"True\",\"allowAS\":1297838264,\"allowASOverride\":\"Enable\",\"fabricASN\":4454526690176817035,\"peerASN\":8048036117290127437,\"ipv4ListenRangePrefixes\":[\"tbkewkqynspg\",\"voffbkkwvdxae\"],\"ipv6ListenRangePrefixes\":[\"kmyrljialzbnobr\",\"lpbcjtrpz\"],\"ipv4NeighborAddress\":[{},{},{},{}],\"ipv6NeighborAddress\":[{}],\"annotation\":\"bxnhsqeaeo\"},\"staticRouteConfiguration\":{\"extension\":\"NPB\",\"bfdConfiguration\":{\"administrativeState\":\"RMA\",\"intervalInMilliSeconds\":1151163794,\"multiplier\":1096882679},\"ipv4Routes\":[{\"prefix\":\"tzarogatmoljiy\",\"nextHop\":[]}],\"ipv6Routes\":[{\"prefix\":\"inmzvfkne\",\"nextHop\":[]}]},\"configurationState\":\"Accepted\",\"provisioningState\":\"Canceled\",\"administrativeState\":\"MAT\",\"mtu\":494194714,\"connectedIPv4Subnets\":[{\"prefix\":\"lugdybnhrxlelf\",\"annotation\":\"k\"},{\"prefix\":\"izcpihtdmiw\",\"annotation\":\"kpty\"},{\"prefix\":\"aydb\",\"annotation\":\"c\"},{\"prefix\":\"ymlcfnzhmhsurlg\",\"annotation\":\"kpmmz\"}],\"connectedIPv6Subnets\":[{\"prefix\":\"auolawiu\",\"annotation\":\"oms\"},{\"prefix\":\"vvjhvvlrlohewjj\",\"annotation\":\"jnkdflqion\"},{\"prefix\":\"waeqkzfzqxjosho\",\"annotation\":\"otryegp\"},{\"prefix\":\"h\",\"annotation\":\"mexznlwkb\"}],\"importRoutePolicyId\":\"kxkhupzerufgj\",\"exportRoutePolicyId\":\"cdr\",\"importRoutePolicy\":{\"importIpv4RoutePolicyId\":\"cemftzgyykyalu\",\"importIpv6RoutePolicyId\":\"kd\"},\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"httwdowr\",\"exportIpv6RoutePolicyId\":\"fjjnnuxxr\"},\"ingressAclId\":\"mhmnulwemp\",\"egressAclId\":\"ifrhjulrsul\",\"isMonitoringEnabled\":\"True\",\"extension\":\"NPB\",\"annotation\":\"snawmhhgzotfri\"},\"id\":\"gkoekvzwxxyxh\",\"name\":\"ghctxbxmolpcqyde\",\"type\":\"kvskiczdfrjei\"}],\"nextLink\":\"kgqaboo\"}")
            .toObject(InternalNetworksList.class);
        Assertions.assertEquals(1621268309, model.value().get(0).vlanId());
        Assertions.assertEquals("bxnhsqeaeo", model.value().get(0).bgpConfiguration().annotation());
        Assertions.assertEquals(1775502514,
            model.value().get(0).bgpConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1579715380, model.value().get(0).bgpConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals(BooleanEnumProperty.TRUE,
            model.value().get(0).bgpConfiguration().defaultRouteOriginate());
        Assertions.assertEquals(1297838264, model.value().get(0).bgpConfiguration().allowAS());
        Assertions.assertEquals(AllowASOverride.ENABLE, model.value().get(0).bgpConfiguration().allowASOverride());
        Assertions.assertEquals(8048036117290127437L, model.value().get(0).bgpConfiguration().peerAsn());
        Assertions.assertEquals("tbkewkqynspg",
            model.value().get(0).bgpConfiguration().ipv4ListenRangePrefixes().get(0));
        Assertions.assertEquals("kmyrljialzbnobr",
            model.value().get(0).bgpConfiguration().ipv6ListenRangePrefixes().get(0));
        Assertions.assertEquals(1151163794,
            model.value().get(0).staticRouteConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1096882679,
            model.value().get(0).staticRouteConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals("tzarogatmoljiy",
            model.value().get(0).staticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("inmzvfkne",
            model.value().get(0).staticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals(Extension.NPB, model.value().get(0).staticRouteConfiguration().extension());
        Assertions.assertEquals(494194714, model.value().get(0).mtu());
        Assertions.assertEquals("k", model.value().get(0).connectedIPv4Subnets().get(0).annotation());
        Assertions.assertEquals("lugdybnhrxlelf", model.value().get(0).connectedIPv4Subnets().get(0).prefix());
        Assertions.assertEquals("oms", model.value().get(0).connectedIPv6Subnets().get(0).annotation());
        Assertions.assertEquals("auolawiu", model.value().get(0).connectedIPv6Subnets().get(0).prefix());
        Assertions.assertEquals("kxkhupzerufgj", model.value().get(0).importRoutePolicyId());
        Assertions.assertEquals("cdr", model.value().get(0).exportRoutePolicyId());
        Assertions.assertEquals("cemftzgyykyalu", model.value().get(0).importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("kd", model.value().get(0).importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("httwdowr", model.value().get(0).exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("fjjnnuxxr", model.value().get(0).exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("mhmnulwemp", model.value().get(0).ingressAclId());
        Assertions.assertEquals("ifrhjulrsul", model.value().get(0).egressAclId());
        Assertions.assertEquals(IsMonitoringEnabled.TRUE, model.value().get(0).isMonitoringEnabled());
        Assertions.assertEquals(Extension.NPB, model.value().get(0).extension());
        Assertions.assertEquals("snawmhhgzotfri", model.value().get(0).annotation());
        Assertions.assertEquals("kgqaboo", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InternalNetworksList model
            = new InternalNetworksList().withValue(Arrays.asList(new InternalNetworkInner().withVlanId(1621268309)
                .withBgpConfiguration(new InternalNetworkPropertiesBgpConfiguration().withAnnotation("bxnhsqeaeo")
                    .withBfdConfiguration(
                        new BfdConfiguration().withIntervalInMilliSeconds(1775502514).withMultiplier(1579715380))
                    .withDefaultRouteOriginate(BooleanEnumProperty.TRUE)
                    .withAllowAS(1297838264)
                    .withAllowASOverride(AllowASOverride.ENABLE)
                    .withPeerAsn(8048036117290127437L)
                    .withIpv4ListenRangePrefixes(Arrays.asList("tbkewkqynspg", "voffbkkwvdxae"))
                    .withIpv6ListenRangePrefixes(Arrays.asList("kmyrljialzbnobr", "lpbcjtrpz"))
                    .withIpv4NeighborAddress(Arrays.asList(new NeighborAddress(), new NeighborAddress(),
                        new NeighborAddress(), new NeighborAddress()))
                    .withIpv6NeighborAddress(Arrays.asList(new NeighborAddress())))
                .withStaticRouteConfiguration(new InternalNetworkPropertiesStaticRouteConfiguration()
                    .withBfdConfiguration(
                        new BfdConfiguration().withIntervalInMilliSeconds(1151163794).withMultiplier(1096882679))
                    .withIpv4Routes(Arrays
                        .asList(new StaticRouteProperties().withPrefix("tzarogatmoljiy").withNextHop(Arrays.asList())))
                    .withIpv6Routes(
                        Arrays.asList(new StaticRouteProperties().withPrefix("inmzvfkne").withNextHop(Arrays.asList())))
                    .withExtension(Extension.NPB))
                .withMtu(494194714)
                .withConnectedIPv4Subnets(
                    Arrays.asList(new ConnectedSubnet().withAnnotation("k").withPrefix("lugdybnhrxlelf"),
                        new ConnectedSubnet().withAnnotation("kpty").withPrefix("izcpihtdmiw"),
                        new ConnectedSubnet().withAnnotation("c").withPrefix("aydb"),
                        new ConnectedSubnet().withAnnotation("kpmmz").withPrefix("ymlcfnzhmhsurlg")))
                .withConnectedIPv6Subnets(
                    Arrays.asList(new ConnectedSubnet().withAnnotation("oms").withPrefix("auolawiu"),
                        new ConnectedSubnet().withAnnotation("jnkdflqion").withPrefix("vvjhvvlrlohewjj"),
                        new ConnectedSubnet().withAnnotation("otryegp").withPrefix("waeqkzfzqxjosho"),
                        new ConnectedSubnet().withAnnotation("mexznlwkb").withPrefix("h")))
                .withImportRoutePolicyId("kxkhupzerufgj")
                .withExportRoutePolicyId("cdr")
                .withImportRoutePolicy(new ImportRoutePolicy().withImportIpv4RoutePolicyId("cemftzgyykyalu")
                    .withImportIpv6RoutePolicyId("kd"))
                .withExportRoutePolicy(new ExportRoutePolicy().withExportIpv4RoutePolicyId("httwdowr")
                    .withExportIpv6RoutePolicyId("fjjnnuxxr"))
                .withIngressAclId("mhmnulwemp")
                .withEgressAclId("ifrhjulrsul")
                .withIsMonitoringEnabled(IsMonitoringEnabled.TRUE)
                .withExtension(Extension.NPB)
                .withAnnotation("snawmhhgzotfri"))).withNextLink("kgqaboo");
        model = BinaryData.fromObject(model).toObject(InternalNetworksList.class);
        Assertions.assertEquals(1621268309, model.value().get(0).vlanId());
        Assertions.assertEquals("bxnhsqeaeo", model.value().get(0).bgpConfiguration().annotation());
        Assertions.assertEquals(1775502514,
            model.value().get(0).bgpConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1579715380, model.value().get(0).bgpConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals(BooleanEnumProperty.TRUE,
            model.value().get(0).bgpConfiguration().defaultRouteOriginate());
        Assertions.assertEquals(1297838264, model.value().get(0).bgpConfiguration().allowAS());
        Assertions.assertEquals(AllowASOverride.ENABLE, model.value().get(0).bgpConfiguration().allowASOverride());
        Assertions.assertEquals(8048036117290127437L, model.value().get(0).bgpConfiguration().peerAsn());
        Assertions.assertEquals("tbkewkqynspg",
            model.value().get(0).bgpConfiguration().ipv4ListenRangePrefixes().get(0));
        Assertions.assertEquals("kmyrljialzbnobr",
            model.value().get(0).bgpConfiguration().ipv6ListenRangePrefixes().get(0));
        Assertions.assertEquals(1151163794,
            model.value().get(0).staticRouteConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1096882679,
            model.value().get(0).staticRouteConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals("tzarogatmoljiy",
            model.value().get(0).staticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("inmzvfkne",
            model.value().get(0).staticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals(Extension.NPB, model.value().get(0).staticRouteConfiguration().extension());
        Assertions.assertEquals(494194714, model.value().get(0).mtu());
        Assertions.assertEquals("k", model.value().get(0).connectedIPv4Subnets().get(0).annotation());
        Assertions.assertEquals("lugdybnhrxlelf", model.value().get(0).connectedIPv4Subnets().get(0).prefix());
        Assertions.assertEquals("oms", model.value().get(0).connectedIPv6Subnets().get(0).annotation());
        Assertions.assertEquals("auolawiu", model.value().get(0).connectedIPv6Subnets().get(0).prefix());
        Assertions.assertEquals("kxkhupzerufgj", model.value().get(0).importRoutePolicyId());
        Assertions.assertEquals("cdr", model.value().get(0).exportRoutePolicyId());
        Assertions.assertEquals("cemftzgyykyalu", model.value().get(0).importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("kd", model.value().get(0).importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("httwdowr", model.value().get(0).exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("fjjnnuxxr", model.value().get(0).exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("mhmnulwemp", model.value().get(0).ingressAclId());
        Assertions.assertEquals("ifrhjulrsul", model.value().get(0).egressAclId());
        Assertions.assertEquals(IsMonitoringEnabled.TRUE, model.value().get(0).isMonitoringEnabled());
        Assertions.assertEquals(Extension.NPB, model.value().get(0).extension());
        Assertions.assertEquals("snawmhhgzotfri", model.value().get(0).annotation());
        Assertions.assertEquals("kgqaboo", model.nextLink());
    }
}
