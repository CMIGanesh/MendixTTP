CREATE TABLE "system$workflow_parentworkflow" (
	"system$workflowid1" BIGINT NOT NULL,
	"system$workflowid2" BIGINT NOT NULL,
	PRIMARY KEY("system$workflowid1","system$workflowid2"),
	CONSTRAINT "uniq_system$workflow_parentworkflow_system$workflowid1" UNIQUE ("system$workflowid1"));
CREATE INDEX "idx_system$workflow_parentworkflow_system$workflow_system$workflow" ON "system$workflow_parentworkflow" ("system$workflowid2" ASC,"system$workflowid1" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('79314052-9dcc-47e5-954b-80ec631ddd41', 
'System.Workflow_ParentWorkflow', 
'system$workflow_parentworkflow', 
'2ae37bf5-ecb8-4c55-b967-d7383925b208', 
'2ae37bf5-ecb8-4c55-b967-d7383925b208', 
'system$workflowid1', 
'system$workflowid2', 
'idx_system$workflow_parentworkflow_system$workflow_system$workflow');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_system$workflow_parentworkflow_system$workflowid1', 
'79314052-9dcc-47e5-954b-80ec631ddd41', 
'84b93b3b-9d0a-342e-b78b-17657b92fc22');
CREATE TABLE "system$workflowactivity_subworkflow" (
	"system$workflowactivityid" BIGINT NOT NULL,
	"system$workflowid" BIGINT NOT NULL,
	PRIMARY KEY("system$workflowactivityid","system$workflowid"),
	CONSTRAINT "uniq_system$workflowactivity_subworkflow_system$workflowactivityid" UNIQUE ("system$workflowactivityid"));
CREATE INDEX "idx_system$workflowactivity_subworkflow_system$workflow_system$workflowactivity" ON "system$workflowactivity_subworkflow" ("system$workflowid" ASC,"system$workflowactivityid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('5c89ec5d-0378-4afd-afd4-0e7a9fde45a9', 
'System.WorkflowActivity_SubWorkflow', 
'system$workflowactivity_subworkflow', 
'a5952592-bb2c-4798-9805-f9ff91ad97de', 
'2ae37bf5-ecb8-4c55-b967-d7383925b208', 
'system$workflowactivityid', 
'system$workflowid', 
'idx_system$workflowactivity_subworkflow_system$workflow_system$workflowactivity');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_system$workflowactivity_subworkflow_system$workflowactivityid', 
'5c89ec5d-0378-4afd-afd4-0e7a9fde45a9', 
'2d65cc25-b704-3604-8f2b-e3c73d37fb2b');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230109 17:05:39';
