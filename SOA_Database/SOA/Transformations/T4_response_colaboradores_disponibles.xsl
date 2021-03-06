<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:ns0="http://xmlns.oracle.com/pcbpel/adapter/db/sp/WS_ConsultarColaboradorDisponible" xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction" xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20" xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions" xmlns:tns="http://xmlns.javeriana.edu.co/co/schemas/process/bpm/ConsultarColaboradoresDisponibles/v1.0" xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator" xmlns:oracle-xsl-mapper="http://www.oracle.com/xsl/mapper/schemas" xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue" xmlns:oraxsl="http://www.oracle.com/XSL/Transform/java" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" exclude-result-prefixes=" xsd oracle-xsl-mapper xsi xsl ns0 tns mhdr oraext xp20 xref socket dvm oraxsl"
                xmlns:plt="http://schemas.xmlsoap.org/ws/2003/05/partner-link/"
                xmlns:ns1="http://xmlns.oracle.com/pcbpel/adapter/db/app_eaes_soaint/SOA_Database/WS_ConsultarColaboradorDisponible"
                xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:jca="http://xmlns.oracle.com/pcbpel/wsdl/jca/"
                xmlns:plnk="http://docs.oasis-open.org/wsbpel/2.0/plnktype"
                xmlns:client="http://xmlns.oracle.com/app_eaes_soaint/SOA_Database/bpel_consultarcolaboradoresdisponibles">
   <oracle-xsl-mapper:schema>
      <!--SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY.-->
      <oracle-xsl-mapper:mapSources>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="../WSDLs/WS_ConsultarColaboradorDisponible.wsdl"/>
            <oracle-xsl-mapper:rootElement name="OutputParameters" namespace="http://xmlns.oracle.com/pcbpel/adapter/db/sp/WS_ConsultarColaboradorDisponible"/>
         </oracle-xsl-mapper:source>
      </oracle-xsl-mapper:mapSources>
      <oracle-xsl-mapper:mapTargets>
         <oracle-xsl-mapper:target type="WSDL">
            <oracle-xsl-mapper:schema location="../WSDLs/bpel_consultarcolaboradoresdisponibles.wsdl"/>
            <oracle-xsl-mapper:rootElement name="Candidatos" namespace="http://xmlns.javeriana.edu.co/co/schemas/process/bpm/ConsultarColaboradoresDisponibles/v1.0"/>
         </oracle-xsl-mapper:target>
      </oracle-xsl-mapper:mapTargets>
      <!--GENERATED BY ORACLE XSL MAPPER 12.2.1.3.0(XSLT Build 170820.1700.2557) AT [WED APR 08 15:03:25 COT 2020].-->
   </oracle-xsl-mapper:schema>
   <!--User Editing allowed BELOW this line - DO NOT DELETE THIS LINE-->
   <xsl:template match="/">
      <tns:Candidatos>
         <xsl:if test="count (/ns0:OutputParameters/ns0:V_ARRAY_COLABORADOR_TYPE/ns0:V_ARRAY_COLABORADOR_TYPE_ITEM ) > 0">
            <xsl:for-each select="/ns0:OutputParameters/ns0:V_ARRAY_COLABORADOR_TYPE/ns0:V_ARRAY_COLABORADOR_TYPE_ITEM">
               <tns:ColaboradoresType>
                  <tns:codigoColaborador>
                     <xsl:value-of select="ns0:ID_CANDIDATO"/>
                  </tns:codigoColaborador>
                  <tns:codigoRol>
                     <xsl:value-of select="ns0:ID_ROL"/>
                  </tns:codigoRol>
                  <tns:primer_nombre>
                     <xsl:value-of select="ns0:PRIMER_NOMBRE"/>
                  </tns:primer_nombre>
                  <tns:segundo_nombre>
                     <xsl:value-of select="ns0:SEGUNDO_NOMBRE"/>
                  </tns:segundo_nombre>
                  <tns:primer_apellido>
                     <xsl:value-of select="ns0:PRIMER_APELLIDO"/>
                  </tns:primer_apellido>
                  <tns:segundo_apellido>
                     <xsl:value-of select="ns0:SEGUNDO_APELLIDO"/>
                  </tns:segundo_apellido>
                  <tns:email>
                     <xsl:value-of select="ns0:EMAIL"/>
                  </tns:email>
                  <tns:telefono>
                     <xsl:value-of select="ns0:TELEFONO"/>
                  </tns:telefono>
                  <tns:disponible>
                     <xsl:value-of select="ns0:DISPONIBLE"/>
                  </tns:disponible>
                  <tns:usuario>
                     <xsl:value-of select="ns0:USUARIO"/>
                  </tns:usuario>
                  <tns:id_documento>
                     <xsl:value-of select="ns0:ID_DOCUMENTO"/>
                  </tns:id_documento>
               </tns:ColaboradoresType>
            </xsl:for-each>
         </xsl:if>
      </tns:Candidatos>
   </xsl:template>
</xsl:stylesheet>
